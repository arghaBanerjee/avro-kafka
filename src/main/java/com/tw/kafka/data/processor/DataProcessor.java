package com.tw.kafka.data.processor;

/**
 * Interface to be implemented by processors of data.
 */
public interface DataProcessor<T> {

    void process(T data);

}
