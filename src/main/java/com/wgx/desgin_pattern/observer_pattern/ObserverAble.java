package com.wgx.desgin_pattern.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverAble {

    private List<Observer> observers = new ArrayList<>();

    private static int status = 0;

    protected void attach(Observer observer) {
        observers.add(observer);
    }

    public void updateStatus(int status) {
        if (status == this.status) {
            return;
        }
        this.status = status;
        notifyAllObserver();
    }

    private void notifyAllObserver() {
        observers.stream().forEach(observer -> observer.update(status));
    }
}
