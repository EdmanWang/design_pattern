package com.wgx.desgin_pattern.observer_pattern;

public abstract class Observer {

    private final ObserverAble observerAble;

    public Observer(ObserverAble observerAble) {
        this.observerAble = observerAble;
        this.observerAble.attach(this);
    }

    abstract void update(int status);
}
