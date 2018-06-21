package com.alekseysamoylov.patterns.deadlock.and.memory.leak;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start Cyclic Dead lock");
        new Thread(Main::performCyclicDeadLock).start();
        System.out.println("Start Heap filler");
        List<String> list = new ArrayList<>();
        String aa = "aaaaAAAAAAAA";
        while (true) {
            list.add(aa);
            aa += "aaaaaaaaaa";
            System.out.println("Hello " + aa.length());
            if (list.size() % 10 == 0) {
                System.out.println("waiting " + list.size());
                Thread.sleep(1000);
            }
        }
    }


    private static void performCyclicDeadLock() {
        String a = "A";
        String b = "B";
        String c = "C";
        startDoItInNewThread(a, b, c);
        startDoItInNewThread(b, c, a);
        startDoItInNewThread(c, a, b);
    }

    private static void startDoItInNewThread(String a, String b, String c) {
        new Thread(() -> {
            try {
                doIt(a, b, c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static void doIt(String a, String b, String c) throws InterruptedException {
        System.out.println("Start a sync");
        synchronized (a) {
            System.out.println("Get lock " + a);
            Thread.sleep(1000);
            synchronized (b) {
                System.out.println("Get lock " + b);
                Thread.sleep(1000);
                synchronized (c) {
                    System.out.println("Get lock " + c);
                    Thread.sleep(1000);
                }
            }
        }

    }
}
