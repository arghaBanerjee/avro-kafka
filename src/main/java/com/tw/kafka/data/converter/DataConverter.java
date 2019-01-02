package com.tw.kafka.data.converter;

/**
 * Interface for mapping implementations from object to avro type
 *
 * @param <T> Type of the data to convert byte[] to and from.
 */
public interface DataConverter<T> {

	T to(Object value);

}
