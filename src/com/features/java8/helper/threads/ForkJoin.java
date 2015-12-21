package com.features.java8.helper.threads;

import java.util.concurrent.RecursiveTask;

/**
 * Created by kvillaca on 12/21/2015.
 */
public class ForkJoin extends RecursiveTask<Double> {


    public static final long THRESHOLD = 1000000;

    private final ISequentialCalculator sequentialCalculator;
    private final double[] numbers;
    private final int start;
    private final int end;

    public ForkJoin(double[] numbers, ISequentialCalculator sequentialCalculator) {
        this(numbers, 0, numbers.length, sequentialCalculator);
    }

    private ForkJoin(double[] numbers, int start, int end, ISequentialCalculator sequentialCalculator) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.sequentialCalculator = sequentialCalculator;
    }

    @Override
    protected Double compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            return sequentialCalculator.computeSequentially(numbers, start, end);
        }
        ForkJoin leftTask = new ForkJoin(numbers, start, start + length/2, sequentialCalculator);
        leftTask.fork();
        ForkJoin rightTask = new ForkJoin(numbers, start + length/2, end, sequentialCalculator);
        Double rightResult = rightTask.compute();
        Double leftResult = leftTask.join();
        return leftResult + rightResult;
    }
}
