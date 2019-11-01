package com.wgx.desgin_pattern.singleton_patten;

/**
 * 这种单例设计模式存在的优点，缺点是
 * 优点：线程安全
 * 缺点：不能实现懒加载，即 如果这个类被其他的类调用，该实例就会被创建出来，在堆上面开辟一块内存空间。
 * 如果长时间不用的话，就会出现资源浪费的情况出现。
 */
public class SingletonPatternVersion1 {

    private static final SingletonPatternVersion1 instance = new SingletonPatternVersion1();

    private SingletonPatternVersion1() {

    }

    public static SingletonPatternVersion1 getInstance() {
        return instance;
    }
}
