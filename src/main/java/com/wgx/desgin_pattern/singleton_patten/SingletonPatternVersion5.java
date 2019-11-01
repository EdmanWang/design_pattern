package com.wgx.desgin_pattern.singleton_patten;

/**
 * 使用volatile 修饰的字段，可以保证内存可见性，有序性，所以在执行读操作前，一定是执行了一遍写操作。
 * 这种单例设计模式存在的优点，缺点是
 * 优点：实现了懒加载，也实现了单例
 * 缺点： 效率低下，使用volatiles 修饰的字段，在编译时或者运行时都不能进行优化。
 */
public class SingletonPatternVersion5 {

    private volatile static SingletonPatternVersion5 instance;

    private SingletonPatternVersion5() {

    }

    // double ckeck
    public synchronized static SingletonPatternVersion5 getInstance() {
        if (instance == null) {
            synchronized (SingletonPatternVersion5.class) {
                if (instance == null) {
                    instance = new SingletonPatternVersion5();
                }
            }
        }
        return instance;
    }
}
