package com.alekseysamoylov.patterns.lock.free;

import java.util.concurrent.atomic.AtomicReference;

/**
 * First variant
 */
public class AtomicValue<T> {
    private final AtomicReference<T> valueRef = new AtomicReference<T>();

    public void update(T value) {
        valueRef.set(value);
    }

    public T removeValue() {
        while (true) {
            T oldValue = valueRef.get();
            if (oldValue == null) {
                return null;
            } else if (valueRef.compareAndSet(oldValue, null)) {
                return oldValue;
            }
        }
    }
}
