package com.tw.event;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Properties;

import static com.google.common.collect.Lists.newArrayList;

public class KafkaConsumerV1 {

	public static void main(String[] args) {

		Properties properties = new Properties();

		// Normal consumer configuration.
		properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
		properties.put("group.id", "customer-consumer-group-v1");
		properties.put("auto.commit.enable", "false");
		properties.put("auto.offset.reset", "earliest");

		// Avro configuration.
		properties.setProperty("key.deserializer", StringDeserializer.class.getName());
		properties.setProperty("value.deserializer", KafkaAvroDeserializer.class.getName());
		properties.setProperty("schema.registry.url", "http://127.0.0.1:8099");
		properties.setProperty("specific.avro.reader", "true"); // We say we want to read Avro specific record.

		org.apache.kafka.clients.consumer.KafkaConsumer<String, ?> kafkaConsumer = new org.apache.kafka.clients.consumer.KafkaConsumer<>(properties);
		String topic = "new-topic1";
		kafkaConsumer.subscribe(newArrayList(topic));

		System.out.println("Waiting for data...");

		while (true) {
			System.out.println("Polling");
			ConsumerRecords<String, ?> records = kafkaConsumer.poll(1000);

			for (ConsumerRecord<String, ?> record : records) {
				System.out.println(record.value());
			}

			kafkaConsumer.commitSync();
		}
	}
}
