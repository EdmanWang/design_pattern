package com.wgx.desgin_pattern.observer_pattern;

/**
 * 总结：观察者模式
 * 1：需要一个被观察者对象，当被观察者对象的相关数据被修改的时候。会触发观察者的相关操作
 * 2：操作流程
 * 1：被观察者对象中需要注册观察者对象
 * 2：当被观察者相关数据发生改变的时候，观察者对象执行相应的操作。
 */
public abstract class Observer {

    private final ObserverAble observerAble;

    public Observer(ObserverAble observerAble) {
        this.observerAble = observerAble;
        this.observerAble.attach(this);
    }

    abstract void update(int status);
}
