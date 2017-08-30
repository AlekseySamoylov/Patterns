package com.alekseysamoylov.patterns.decorator;

/**
 * Created by alekseysamoylov on 8/30/17.
 */
public abstract class AbstractComponentDecoratorImpl implements AbstractComponentDecorator {
    private Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    public void removeComponent() {
        component = null;
    }

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }
    }

}
