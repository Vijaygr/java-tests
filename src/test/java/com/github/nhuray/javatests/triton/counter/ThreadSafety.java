package com.github.nhuray.javatests.triton.counter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreadSafety {

    @Test
    public void synchronizedObject() throws Exception {
        // Given 10 threads
        Thread[] threads = new Thread[10];

        // When
        SynchronizedCounter counter = new SynchronizedCounter();
        RunnableCounter runnable = new RunnableCounter(counter);

        for (int i = 0; i < threads.length; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            thread.join();
        }

        // Then
        assertEquals(1000, counter.get());
    }


    @Test
    public void atomicInteger() throws Exception {
        // Given 10 threads
        Thread[] threads = new Thread[10];

        // When
        AtomicCounter counter = new AtomicCounter();
        RunnableCounter runnable = new RunnableCounter(counter);

        for (int i = 0; i < threads.length; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            thread.join();
        }

        // Then
        assertEquals(1000, counter.get());
    }


    @Test
    public void lock() throws Exception {
        // Given 10 threads
        Thread[] threads = new Thread[10];

        // When
        LockedCounter counter = new LockedCounter();
        RunnableCounter runnable = new RunnableCounter(counter);

        for (int i = 0; i < threads.length; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            thread.join();
        }

        // Then
        assertEquals(1000, counter.get());
    }



}
