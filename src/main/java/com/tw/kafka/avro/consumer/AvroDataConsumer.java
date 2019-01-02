package com.tw.kafka.avro.consumer;

import com.tw.kafka.data.converter.DataConverter;
import com.tw.kafka.data.processor.DataProcessor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

import static com.google.common.collect.Lists.newArrayList;

/**
 * A wrapper around Kafka's Consumer API that instantiates a consumer,converter and processor
 */
public class AvroDataConsumer<T> {

	private static final Logger LOGGER = LoggerFactory.getLogger(AvroDataConsumer.class);

	private KafkaConsumer<String, T> consumer;
	private final DataConverter<T> dataConverter;
	private final DataProcessor<T> dataProcessor;
	private final String topic;


	public AvroDataConsumer(String topic, Properties properties, DataConverter<T> dataConverter, DataProcessor<T> dataProcessor) {
		this.consumer = new KafkaConsumer<>(properties);
		this.consumer.subscribe(newArrayList(topic));
		this.dataConverter = dataConverter;
		this.dataProcessor = dataProcessor;
		this.topic = topic;
	}

	public void consume() {
		ConsumerRecords<String, T> records = consumer.poll(100);
		LOGGER.info("Consuming {} records", records.count());

		for (ConsumerRecord<String, T> record : records) {
			if (record.topic().equals(topic)) {
				//LOGGER.info("Consuming {} from {}", record, topic);

				//convert the data to the required format
				T data = dataConverter.to(record.value());

				//process the data i.e write to database etc
				dataProcessor.process(data);

				consumer.commitSync();
			}
		}
	}


}
