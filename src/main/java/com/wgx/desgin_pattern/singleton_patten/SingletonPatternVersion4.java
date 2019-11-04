package com.wgx.desgin_pattern.singleton_patten;

/**
 * 这种单例设计模式存在的优点，缺点是
 * 优点：实现了懒加载，也实现了单例
 * 缺点：在类加载过程中，在类初始化过程中，如果构造函数中需要执行的代码认为量很大，在初始化过程还没完成就去调用getInstance 函数，可能会出现空指针异常
 *        简而言之-----> 即不能保证，在读取instance字段值之前，已经写入了instance字段值
 */

public class SingletonPatternVersion4 {
    private static SingletonPatternVersion4 instance;

    private Object obj1;

    private Object obj2;

    /**
     *
     */
    private SingletonPatternVersion4() {
        // do more
        obj1 = new Object();
        obj2 = new Object();
    }

    // double ckeck
    public synchronized static SingletonPatternVersion4 getInstance() {
        if (instance == null) {
            synchronized (SingletonPatternVersion4.class) {
                if (instance == null) {
                    /**
                     * 如果没有用volatile 修饰地话可能会出现nullPointExecption
                     * 原因就是下面的new 操作，会涉及到指令重排序
                     */
                    instance = new SingletonPatternVersion4();
                }
            }
        }
        return instance;
    }
}

