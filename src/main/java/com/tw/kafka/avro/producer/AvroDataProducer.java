package com.tw.kafka.avro.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * Wrapper around Kafka Producer API that instantiates a producer.
 */
public class AvroDataProducer<T> {

	private static final Logger LOGGER = LoggerFactory.getLogger(AvroDataProducer.class);

	private final KafkaProducer<String, T> producer;
	private final String topic;

	public AvroDataProducer(String topic, Properties properties) {
		this.producer = new KafkaProducer<>(properties);
		this.topic = topic;
	}

	public void produce(T data) {
		LOGGER.info("Producing " + data + " to " + topic);
		producer.send(new ProducerRecord<>(topic, data));
		producer.flush();
	}

	public void close() {
		this.producer.close();
	}

}
