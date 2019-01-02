package com.tw.kafka.data.converter;

import org.apache.avro.specific.SpecificRecord;

public class AvroRecordConverter<T extends SpecificRecord> implements DataConverter<T> {

	@Override
	public T to(Object value) {
		return (T)value;
	}

}
