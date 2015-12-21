package com.features.java8.main;

import com.features.java8.helper.threads.ForkJoin;
import com.features.java8.helper.threads.ISequentialCalculator;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by kvillaca on 12/21/2015.
 *
 * Patial example extracted from http://www.infoq.com/articles/forkjoin-to-parallel-streams
 */
public class ForkJoinMain {


    public static void main(String[] args) {
        final double[] DOUBLE_ARRAY = {10.00, 20.00, 30.00, 40.50, 50.60, 60.00, 80.99, 100.67, 200.10, 300.10, 1.99};

        System.out.println("Array ");
        final int arrayLength = DOUBLE_ARRAY.length;
        for(int i = 0; i < arrayLength; i++) {
            System.out.print(DOUBLE_ARRAY[i]);
            if (i < arrayLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        final double result = varianceForkJoin(DOUBLE_ARRAY);
        System.out.println("Result from the varianceForkJoin method " + result);
    }

    public static double varianceForkJoin(double[] population){
        final ForkJoinPool forkJoinPool = new ForkJoinPool();

        double total = forkJoinPool.invoke(new ForkJoin(population, new ISequentialCalculator() {
            @Override
            public double computeSequentially(double[] numbers, int start, int end) {
                double total = 0;
                for (int i = start; i < end; i++) {
                    total += numbers[i];
                }
                return total;
            }
        }));
        final double average = total / population.length;

        double variance = forkJoinPool.invoke(new ForkJoin(population, new ISequentialCalculator() {
            @Override
            public double computeSequentially(double[] numbers, int start, int end) {
                double variance = 0;
                for (int i = start; i < end; i++) {
                    variance += (numbers[i] - average) * (numbers[i] - average);
                }
                return variance;
            }
        }));
        return variance / population.length;
    }
}
