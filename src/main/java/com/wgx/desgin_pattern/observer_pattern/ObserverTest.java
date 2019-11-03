package com.wgx.desgin_pattern.observer_pattern;

public class ObserverTest {

    public static void main(String[] args) {
        ObserverAble observerAble = new ObserverAble();

        new BinaryObserver(observerAble);
        new OctalObserver(observerAble);
        System.out.println("------------------");
        observerAble.updateStatus(10);
        observerAble.updateStatus(10);
        System.out.println("------------------");
        observerAble.updateStatus(11);
    }
}
