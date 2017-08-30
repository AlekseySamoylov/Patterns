package com.alekseysamoylov.patterns.decorator;

/**
 * Created by alekseysamoylov on 8/30/17.
 */
public class Main {

    public static void main(String[] args) {
        AbstractComponentDecorator decorator = new ConcreteComponentDecorator();

        Component component = new ConcreteComponent();
        decorator.setComponent(component);

        decorator.doJob();
    }
}
