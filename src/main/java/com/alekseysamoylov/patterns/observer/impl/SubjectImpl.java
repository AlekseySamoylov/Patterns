package com.alekseysamoylov.patterns.observer.impl;

import com.alekseysamoylov.patterns.observer.Observer;
import com.alekseysamoylov.patterns.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int data) {
        observers.parallelStream().forEach(observer -> observer.update(data));
    }
}
