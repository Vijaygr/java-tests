package com.github.nhuray.javatests.triton.counter;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Here we use an AtomicInteger
 */
public class AtomicCounter implements Counter {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int get() {
        return counter.get();
    }
}
