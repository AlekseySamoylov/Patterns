package com.alekseysamoylov.patterns.profiler;


import java.util.concurrent.atomic.AtomicLong;
import org.javasimon.SimonManager;
import org.javasimon.Split;
import org.javasimon.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopWatchProfiler {

  private static final Logger LOGGER = LoggerFactory.getLogger(StopWatchProfiler.class);
  private static final Stopwatch stopwatch = SimonManager.getStopwatch("org.javasimon.examples.HelloWorld-stopwatch");


  public static void main(String[] args) throws InterruptedException {
    AtomicLong atomicLong = new AtomicLong();
    while (true) {
      atomicLong.incrementAndGet();
      Split split = stopwatch.start();
      LOGGER.info("Hello ");
      Thread.sleep(1000 + (long) (Math.random() * 100));
      LOGGER.info("World");
      split.stop();
      LOGGER.info("Stopwatch {}", stopwatch);
      if (atomicLong.incrementAndGet() == 100) {
        break;
      }
    }
  }
}
