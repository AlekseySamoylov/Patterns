package com.alekseysamoylov.patterns.decorator;

/**
 * Created by alekseysamoylov on 8/30/17.
 */
public class ConcreteComponent implements Component {

    @Override
    public void doJob() {
        System.out.println("Do concrete job");
    }
}
