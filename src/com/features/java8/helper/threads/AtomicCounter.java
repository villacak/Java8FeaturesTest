package com.features.java8.helper.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kvillaca on 12/21/2015.
 */
public class AtomicCounter {

    // AtomicInteger is a thread safe int.
    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }

}
