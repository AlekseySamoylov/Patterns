package com.alekseysamoylov.patterns.singleton;

/**
 * lazy initialization
 */
public final class SingletonLazyInitialization {

    private SingletonLazyInitialization() {
    }

    private static volatile SingletonLazyInitialization instance;

    public static SingletonLazyInitialization getInstance() {
        SingletonLazyInitialization localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonLazyInitialization.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonLazyInitialization();
                }
            }
        }

        return localInstance;
    }
}
