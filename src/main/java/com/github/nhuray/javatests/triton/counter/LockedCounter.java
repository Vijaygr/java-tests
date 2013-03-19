package com.github.nhuray.javatests.triton.counter;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Here we use a {@link ReentrantReadWriteLock} from java.util.concurrent.locks package.
 */
public class LockedCounter implements Counter {

    private int counter;
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void increment() {
        lock.writeLock().lock();
        counter++;
        lock.writeLock().unlock();
    }

    public int get() {
        lock.readLock().lock();
        try {
            return counter;
        } finally {
            lock.readLock().unlock();
        }
    }
}
