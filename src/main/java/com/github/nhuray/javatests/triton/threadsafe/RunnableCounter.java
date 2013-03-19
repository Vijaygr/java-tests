package com.github.nhuray.javatests.triton.threadsafe;

/**
 * Runnable which call 100 times Counter#increment() method.
 */
public class RunnableCounter implements Runnable {

    private Counter counter;

    public RunnableCounter(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }
}
