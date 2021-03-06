package com.features.java8.helper.threads;

/**
 * Created by kvillaca on 12/21/2015.
 *
 * This class is just to show the difference between regular primitive types with thread safe types.
 *
 * Please refer the AtomicCounter.java class
 */
public class RegularCounter {

    // No thread safe at all
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}
