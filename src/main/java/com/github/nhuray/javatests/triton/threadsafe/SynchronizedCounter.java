package com.github.nhuray.javatests.triton.threadsafe;

/**
 * Here we use a static object to synchronized increment operation between threads
 */
public class SynchronizedCounter implements Counter {

    private int counter;
    private static Object sync = new Object(); // synchronized object

    public void increment() {
        synchronized (sync) {
            counter++;
        }
    }

    public int get() {
        return counter;
    }
}
