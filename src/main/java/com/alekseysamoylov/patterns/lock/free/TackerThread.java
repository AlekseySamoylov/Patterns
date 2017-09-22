package com.alekseysamoylov.patterns.lock.free;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/**
 * Second variant
 */
public class TackerThread<T> extends Thread {

    private final AtomicReference<T> valueRef = new AtomicReference<T>();

    public void updateValue(T value) {
        valueRef.set(value);
        // will unpark threads that not already park right now
        LockSupport.unpark(this);
    }

    // takes current value, waiting until it is updated
    public T takeValue() throws InterruptedException {
        assert Thread.currentThread() == this;
        while (true) {
            T oldValue = valueRef.get();
            if (oldValue == null) {
                // this is com.alekseysamoylov.patterns.lock free waiting...
                LockSupport.park();
                // ...with appropriate interrupted idiom
                if (interrupted()) {
                    throw new InterruptedException();
                }
            } else if (valueRef.compareAndSet(oldValue, null)) {
                return oldValue;
            }
        }
    }


}
