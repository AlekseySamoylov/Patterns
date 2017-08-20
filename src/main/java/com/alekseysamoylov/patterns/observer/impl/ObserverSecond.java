package com.alekseysamoylov.patterns.observer.impl;

import com.alekseysamoylov.patterns.observer.Observer;

public class ObserverSecond implements Observer {
    private int data;

    @Override
    public void update(int data) {
        this.data = data;
        System.out.println("Updated " + this);

    }

    @Override
    public String toString() {
        return "ObserverSecond{" +
                "data=" + data +
                '}';
    }
}
