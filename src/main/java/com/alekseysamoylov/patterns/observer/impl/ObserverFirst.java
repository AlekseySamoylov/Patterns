package com.alekseysamoylov.patterns.observer.impl;

import com.alekseysamoylov.patterns.observer.Observer;

public class ObserverFirst implements Observer {

    private int data;

    @Override
    public void update(int data) {
        this.data = data;
        System.out.println("Observer updated " + this);
    }


    @Override
    public String toString() {
        return "ObserverFirst{" +
                "data=" + data +
                '}';
    }
}
