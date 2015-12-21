package com.features.java8.helper.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by kvillaca on 12/21/2015.
 *
 * This is an example that can add and subtract one in a thread environment without having the problem
 * that is expected when performing those tasks in a multi-thread environment.
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
