package com.tw.event;

import com.tw.avro.objects.DocumentDetails;
import com.tw.avro.objects.DocumentDetailsEvent;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

// After sending Avro data to kafka, we can use this consumer:
// $> kafka-avro-console-consumer --bootstrap-server 127.0.0.1:9092 --topic customer-avro --from-beginning --property schema.registry.url=http://127.0.0.1:8081

public class KafkaProducerV1 {
	public static void main(String[] args) {
		Properties properties = new Properties();

		// Regular producer configuration.
		properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
		properties.setProperty("acks", "all");
		properties.setProperty("retries", "2");

		// Avro configuration.
		properties.setProperty("key.serializer", StringSerializer.class.getName());
		properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
		properties.setProperty("schema.registry.url", "http://127.0.0.1:8099");

		Producer<String, DocumentDetailsEvent> kafkaProducer = new org.apache.kafka.clients.producer.KafkaProducer<>(properties);
		String topic = "new-topic1";

//		// produce
//		DocumentDetails doc = DocumentDetails.newBuilder()
//				.setDocumentId("AC1234456")
//				.setDocumentType("PASSPORT")
//				.setIssueDate(LocalDateTime.now()
//						.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")))
//				.setExpiryDate(LocalDateTime.now()
//						.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")))
//				.setIssuerCountry("ENGLAND")
//				.setNationality("British")
//				.setFirstName("JAMES")
//				.setLastName("BOND")
//				.build();
//
//		DocumentDetailsEvent docDeatilsEvent = DocumentDetailsEvent.newBuilder()
//				.setDocument(doc)
//				.setKey(String.valueOf(Math.random()))
//				.setName("DocumentDetailsEvent")
//				.setTime(LocalDateTime.now()
//						.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")))
//				.setProfile("123007")
//				.setType("NEW")
//				//.setNewFiled("TEST_FIELD")
//				.build();

		/**NewEvent event = NewEvent.newBuilder()
				.setDescription("test")
				.setKey("12344")
				.build();**/


		ProducerRecord<String, DocumentDetailsEvent> producerRecord = new ProducerRecord<>(topic, null);

		kafkaProducer.send(producerRecord, new Callback() {

			@Override
			public void onCompletion(RecordMetadata metadata, Exception exception) {
				if (exception == null) {
					System.out.println("Success");
					System.out.println(metadata.toString());
				} else {
					exception.printStackTrace();
				}
			}
		});

		kafkaProducer.flush();
		kafkaProducer.close();
	}
}