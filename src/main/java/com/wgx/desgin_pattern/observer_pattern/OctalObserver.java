package com.wgx.desgin_pattern.observer_pattern;

public class OctalObserver extends Observer {

    public OctalObserver(ObserverAble observerAble) {
        super(observerAble);
    }

    @Override
    void update(int status) {
        System.out.println(status + "转换成八进制是" + Integer.toOctalString(status));
    }
}
