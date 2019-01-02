package com.tw.kafka;

import com.google.common.base.Function;
import com.tw.avro.objects.DocumentDetails;
import com.tw.avro.objects.DocumentDetailsEvent;
import com.tw.kafka.avro.consumer.AvroDataConsumer;
import com.tw.kafka.avro.producer.AvroDataProducer;
import com.tw.kafka.data.converter.AvroRecordConverter;
import com.tw.kafka.data.converter.DataConverter;
import com.tw.kafka.data.processor.DataProcessor;
import com.tw.kafka.data.processor.EventDataProcessor;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static com.tw.kafka.config.PropertiesLoader.fromFile;

public class DemoV1 {

	static final String topicName = "verification.topic.avro";

	public void dataPublisher() throws InterruptedException, IOException {

		//client generated data
		DocumentDetailsEvent documentDetailsEventData = getData();

		//create the avro publisher - warpper on kafka producer
		AvroDataProducer<DocumentDetailsEvent> producer = createProducer(topicName);

		//publish data using avro warpper
		publish(producer, documentDetailsEventData);

	}

	public void dataConsumer() throws InterruptedException, IOException {

		//create the avro consumer - warpper on kafka consumer
		AvroDataConsumer<DocumentDetailsEvent> consumer = createConsumer(topicName);

		//start consuming data from the topic
		consume(consumer);

	}

	public static void main(String[] args) throws Exception {
		new DemoV1().dataPublisher();
		new DemoV1().dataConsumer();


	}

	private void consume(AvroDataConsumer<DocumentDetailsEvent> consumer) throws InterruptedException {
		// consume
		int retries = 0;
		int maxRetries = 5;
		while (retries++ < maxRetries) {
			TimeUnit.SECONDS.sleep(1);
			consumer.consume();
		}
	}

	private void publish(AvroDataProducer<DocumentDetailsEvent> producer, DocumentDetailsEvent docDeatilsEvent) {
		producer.produce(docDeatilsEvent);
		producer.close();
	}

	private DocumentDetailsEvent getData() {
		// produce
		DocumentDetails doc = DocumentDetails.newBuilder()
				.setDocumentId("AC1234456")
				.setDocumentType("PASSPORT")
				.setIssuerCountry("ENGLAND")
				.setNationality("British")
				.setFirstName("JAMES")
				.setLastName("BOND")
				.build();

		return DocumentDetailsEvent.newBuilder()
				.setDocument(doc)
				.setKey(String.valueOf(Math.random()))
				.setName("DocumentDetailsEvent")
				.setType("UPDATE")
				.setProfile("123007")
				.build();
	}

	private AvroDataConsumer<DocumentDetailsEvent> createConsumer(String topicName) throws IOException {
		// setup the mapper & processor
		DataConverter<DocumentDetailsEvent> dataConverter = new AvroRecordConverter();
		DataProcessor<DocumentDetailsEvent> dataProcessor = new EventDataProcessor(PROCESS_DOCUMENT_DATA);
		// setup consumer
		return new AvroDataConsumer<>(topicName, fromFile("consumer.properties"), dataConverter, dataProcessor);
	}

	private AvroDataProducer<DocumentDetailsEvent> createProducer(String topicName) throws IOException {
		// setup producer
		return new AvroDataProducer<>(topicName, fromFile("producer.properties"));
	}

	private static final Function<DocumentDetailsEvent, String> PROCESS_DOCUMENT_DATA = documentEvent -> "Documnet Type : " +documentEvent.getDocument().getDocumentType() + " Issuer Country: "+documentEvent.getDocument().getIssuerCountry() + " Event Time: "+ documentEvent.getTime();


}

