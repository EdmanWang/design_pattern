package com.wgx.desgin_pattern.producer_consumer_parttern;

import java.util.Collection;

public class Consumer {

    public static void consumer(Object lock, Collection<Double> collection) {
        synchronized (lock) {
            while (collection.isEmpty()) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Object[] objects = collection.toArray();
            System.out.println("消费的数据是=====>" + objects[0]);
            collection.clear();
            lock.notifyAll();
        }
    }
}
