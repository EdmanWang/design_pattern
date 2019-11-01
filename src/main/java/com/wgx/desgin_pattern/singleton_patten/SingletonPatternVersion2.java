package com.wgx.desgin_pattern.singleton_patten;

/**
 * 这种单例设计模式存在的优点，缺点是
 * 优点：实现了懒加载
 * 缺点：线程不安全，存在并发问题,可能会创建一个以上不同的实例
 */
public class SingletonPatternVersion2 {

    private static SingletonPatternVersion2 instance;

    private SingletonPatternVersion2() {

    }

    public static SingletonPatternVersion2 getInstance() {
        if (instance == null) {
            instance = new SingletonPatternVersion2();
        }
        return instance;
    }
}
