package com.alekseysamoylov.patterns.proxy;

/**
 * Created by alekseysamoylov on 8/26/17.
 */
public class SubjectImpl implements Subject {
    @Override
    public void someWork() {
        System.out.println("Real subject does work");
    }
}
