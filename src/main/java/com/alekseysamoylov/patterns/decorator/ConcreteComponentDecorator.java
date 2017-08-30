package com.alekseysamoylov.patterns.decorator;

/**
 * Created by alekseysamoylov on 8/30/17.
 */
public class ConcreteComponentDecorator extends AbstractComponentDecoratorImpl {

    public void doJob() {
        super.doJob();
        System.out.println("Concrete decorator has done the job.");
    }

}
