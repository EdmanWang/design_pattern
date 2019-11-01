package com.wgx.desgin_pattern.singleton_patten;

import java.util.stream.IntStream;

public class SingletonPatternVersion7 {

    private static SingletonPatternVersion7 instance;

    private SingletonPatternVersion7() {

    }

    private enum SingletonEnum {
        INSTANCE;

        SingletonEnum() {
            instance = new SingletonPatternVersion7();
        }

        public SingletonPatternVersion7 getInstance() {
            return instance;
        }

    }

    public static SingletonPatternVersion7 getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 500).forEach(i -> {
            System.out.println(SingletonPatternVersion7.getInstance());
        });
    }
}
