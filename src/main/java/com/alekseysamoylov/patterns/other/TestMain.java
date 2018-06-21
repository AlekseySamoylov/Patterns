package com.alekseysamoylov.patterns.other;

/**
 * Created by alekseysamoylov on 10/9/17.
 */
public class TestMain {
    public static void main(String[] args) {
        One one = new Three();
        one.one();
    }

}

class SubError extends Error {

}

class One {
    public void one() {
        System.out.println("One");
        two();
        try {
            throw new SubError();
        } catch (Error error) {
            System.out.println(error.getMessage());
        }
    }

    private void two() {
        System.out.println("two");
    }
}

class Three extends One {
    @Override
    public void one() {
        System.out.println("Three");
        two();
        super.one();
    }

    private void two() {
        System.out.println("four");
    }
}
