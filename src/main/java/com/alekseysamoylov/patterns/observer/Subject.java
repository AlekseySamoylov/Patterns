package com.alekseysamoylov.patterns.observer;

/**
 * Created by alekseysamoylov on 8/20/17.
 */
public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers(int data);
}
