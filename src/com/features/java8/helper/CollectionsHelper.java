package com.features.java8.helper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kvillaca on 12/15/2015.
 */
public class CollectionsHelper {

    public static String[] populateStringArray(int numberOfItems) {
        final String partialWord = "partialArrayParallel";
        String[] dummyStringArray = null;
        if (numberOfItems > 0) {
            dummyStringArray = new String[numberOfItems];
            for (int i = 0; i < numberOfItems; i++) {
                final double randomNumber = (Math.random() * numberOfItems);
                final StringBuilder sb = new StringBuilder(partialWord).append(randomNumber);
                dummyStringArray[i] = sb.toString();
            }
        }
        return dummyStringArray;
    }


    public static Double[] populateDoubleArray(int numberOfItems) {
        final String partialWord = "partialArrayParallel";
        Double[] dummyDoubleArray = null;
        if (numberOfItems > 0) {
            dummyDoubleArray = new Double[numberOfItems];
            for (int i = 0; i < numberOfItems; i++) {
                final double randomNumber = (Math.random() * numberOfItems);
                dummyDoubleArray[i] = randomNumber;
            }
        }
        return dummyDoubleArray;
    }


    public static List<String> populateStringList(int numberOfItems) {
        final String partialWord = "partialListParallel";
        List<String> dummyStringList = null;
        if (numberOfItems > 0) {
            dummyStringList = new ArrayList<String>();
            for (int i = 0; i < numberOfItems; i++) {
                final double randomNumber = (Math.random() * numberOfItems);
                final StringBuilder sb = new StringBuilder(partialWord).append(randomNumber);
                dummyStringList.add(sb.toString());
            }
        }
        return dummyStringList;
    }


    public static List<Double> populateDoubleList(int numberOfItems) {
        List<Double> dummyDoubleList = null;
        if (numberOfItems > 0) {
            dummyDoubleList = new ArrayList<Double>();
            for (int i = 0; i < numberOfItems; i++) {
                final double randomNumber = (Math.random() * numberOfItems);
                dummyDoubleList.add(randomNumber);
            }
        }
        return dummyDoubleList;
    }
}
