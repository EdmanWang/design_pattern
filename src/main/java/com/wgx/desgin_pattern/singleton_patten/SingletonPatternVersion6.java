package com.wgx.desgin_pattern.singleton_patten;

import java.util.stream.IntStream;

/**
 * 使用类加载器加载类的特性，去实现单例设计模式
 * 优点：
 * 实现了懒加载，也完成了单例设计模式。不存在并发问题，也不存在效率问题。
 */
public class SingletonPatternVersion6 {

    private SingletonPatternVersion6() {

    }

    static class SingletonHolder {
        private static final SingletonPatternVersion6 instance = new SingletonPatternVersion6();
    }

    public static SingletonPatternVersion6 getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 500).forEach(i -> {
            System.out.println(SingletonPatternVersion6.getInstance());
        });
    }
}
