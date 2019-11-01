package com.wgx.desgin_pattern.producer_consumer_parttern;

import java.util.Collection;

public class Producer {

    public static void product(Object lock, Collection<Double> collection) {
        synchronized (lock) {
            while (!collection.isEmpty()) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            double random = Math.random();
            collection.add(random);
            System.out.println("生产的数据是----->" + random);
            lock.notifyAll();
        }
    }
}
