package com.wgx.desgin_pattern.producer_consumer_parttern;

import java.util.ArrayList;
import java.util.Collection;

public class ProducerConsumerTest {

    private static final Object LOCK = new Object();

    private static volatile Collection<Double> collection = new ArrayList<>();

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Producer.product(LOCK, collection);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Consumer.consumer(LOCK, collection);
                }
            }
        }).start();
    }
}
