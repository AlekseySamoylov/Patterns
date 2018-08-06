package com.alekseysamoylov.patterns.profiler;


import java.util.concurrent.atomic.AtomicLong;
import org.javasimon.SimonManager;
import org.javasimon.Split;
import org.javasimon.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StopWatchProfiler {

  private static final Logger LOGGER = LoggerFactory.getLogger(StopWatchProfiler.class);
  private static final Stopwatch stopwatch = SimonManager.getStopwatch(StopWatchProfiler.class.getName());


  public static void main(String[] args) throws InterruptedException {
    AtomicLong atomicLong = new AtomicLong();
    while (!monitoredMethod(atomicLong)) {
      LOGGER.info("Hello world");
      Split split2 = stopwatch.start();
      monitoredMethod(atomicLong);
      split2.stop();
      LOGGER.info("Stopwatch 2 {}", stopwatch);
      Split split3 = stopwatch.start();
      monitoredMethod(atomicLong);
      split3.stop();
      LOGGER.info("Stopwatch 3 {}", stopwatch);
    }
  }

  private static boolean monitoredMethod(AtomicLong atomicLong) throws InterruptedException {
    atomicLong.incrementAndGet();
    Split split = stopwatch.start();
    Thread.sleep(1000 + (long) (Math.random() * 100));
    split.stop();
    LOGGER.info("Stopwatch 1 {}", stopwatch);
    return atomicLong.incrementAndGet() == 100;
  }
}
