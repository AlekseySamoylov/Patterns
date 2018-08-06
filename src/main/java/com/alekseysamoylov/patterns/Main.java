package com.alekseysamoylov.patterns;

public class Main {

  public static void main(String[] args) {
    System.out.println(Math.round(13000.9d / 1000) * 1000);
    System.out.println(Math.round(13000.1d / 1000) * 1000);

    System.out.println(Math.round(Math.max(Math.min(0.3 * 1, 15_000), 13000.9)));

    Thread thread = new Thread(() ->
    {
      try {
        while (true) {
          System.out.println("Hello");
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          if (Thread.interrupted()) {
            throw new InterruptedException();
          }
        }
      } catch (InterruptedException ie) {
        System.out.println("Exit from thread");
      }
    });

    thread.start();

    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(thread.isInterrupted());
    thread.interrupt();
    System.out.println(thread.isInterrupted());

  }
}
