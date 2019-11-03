package com.wgx.desgin_pattern.observer_pattern;

public class BinaryObserver extends Observer {

    public BinaryObserver(ObserverAble observerAble) {
        super(observerAble);
    }

    @Override
    void update(int status) {
        System.out.println(status + "转换成二进制是" + Integer.toBinaryString(status));
    }
}
