package com.tw.kafka.data.processor;

import com.google.common.base.Function;
import org.apache.avro.specific.SpecificRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Processor implementation that only takes a record
 */
public class EventDataProcessor<T extends SpecificRecord, S> implements DataProcessor<T> {

	private static final Logger LOGGER = LoggerFactory.getLogger(EventDataProcessor.class);

	private final Function<T, S> converter;

	public EventDataProcessor(Function<T, S> converter) {
		this.converter = converter;
	}

	@Override
	public void process(T data) {
		S returnObj = converter.apply(data);
		LOGGER.info("Data Processed: " + returnObj);
	}

}
