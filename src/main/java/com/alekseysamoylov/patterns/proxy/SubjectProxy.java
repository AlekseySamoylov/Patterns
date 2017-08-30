package com.alekseysamoylov.patterns.proxy;

/**
 * Created by alekseysamoylov on 8/26/17.
 */
public class SubjectProxy implements Subject {
    private Subject subject;

    @Override
    public void someWork() {

        if (subject == null) {
            System.out.println("Lazy initialization SubjectImpl in Proxy object");
            // lazy initialization
            subject = new SubjectImpl();
        }

        subject.someWork();

    }
}
