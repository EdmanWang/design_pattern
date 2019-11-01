package com.wgx.desgin_pattern.singleton_patten;

/**
 * 这种单例设计模式存在的优点，缺点是
 * 优点：实现了懒加载，也实现了单例
 * 缺点：在多线程并发的情况下，效率低下。
 */
public class SingletonPatternVersion3 {

    private static SingletonPatternVersion3 instance;

    private SingletonPatternVersion3() {

    }

    public synchronized static SingletonPatternVersion3 getInstance() {
        if (instance == null) {
            instance = new SingletonPatternVersion3();
        }
        return instance;
    }
}
