package com.alekseysamoylov.patterns.observer;

import com.alekseysamoylov.patterns.observer.impl.ObserverFirst;
import com.alekseysamoylov.patterns.observer.impl.ObserverSecond;
import com.alekseysamoylov.patterns.observer.impl.SubjectImpl;

/**
 * Created by alekseysamoylov on 8/20/17.
 */
public class Main {
    public static void main(String[] args) {
        Observer observer1 = new ObserverFirst();
        Observer observer2 = new ObserverSecond();
        Observer observer3 = new ObserverSecond();
        Subject subject = new SubjectImpl();
        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);
        subject.notifyObservers(5);
    }
}
