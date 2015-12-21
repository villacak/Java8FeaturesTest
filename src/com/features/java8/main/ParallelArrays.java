package com.features.java8.main;

import com.features.java8.helper.collections.CollectionsHelper;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Class that create Arrays and List with String and Double,
 * then sort it.
 * This is made to compare regular Java sort with the new parallel sort
 *
 * Parallel is quite faster then the standard, however it uses more memory
 * in the List.
 *
 * Created by kvillaca on 12/15/2015.
 */
public class ParallelArrays {

    private static String[] dummyStringArray;
    private static Double[] dummyDoubleArray;

    private static List<String> dymmyStringList;

    private static final int NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY = 10000000;
    private static final int NUMBER_ITEMS_TO_GENERATE_FOR_LIST = 10000000;

    public static void main(String[] args) {
        System.out.println("Preparing Data - Creating a String array with " + NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY +
                " items");
        dummyStringArray = CollectionsHelper.populateStringArray(NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY);
        System.out.println("Star Tests");

        System.out.println("Sorting String array");
        Date start = new Date();
        System.out.println("Starting sort without parallel - " + start);
        Arrays.sort(dummyStringArray);
        Date stop = new Date();
        System.out.println("Stopping sort without parallel - " + stop);
        dummyStringArray = null;


        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Preparing Data - Creating a String array with " + NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY +
                " items");
        dummyStringArray = CollectionsHelper.populateStringArray(NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY);

        System.out.println();
        start = new Date();
        System.out.println("Starting sort with parallel - " + start);
        Arrays.parallelSort(dummyStringArray);
        stop = new Date();
        System.out.println("Stopping sort with parallel - " + stop);
        dummyStringArray = null;


        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Preparing Data - Creating a Double array with " + NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY +
                " items");
        dummyDoubleArray = CollectionsHelper.populateDoubleArray(NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY);

        System.out.println();
        System.out.println("Sorting Double array");

        start = new Date();
        System.out.println("Starting sort without parallel - " + start);
        Arrays.sort(dummyDoubleArray);
        stop = new Date();
        System.out.println("Stopping sort without parallel - " + stop);
        dummyDoubleArray = null;

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Preparing Data - Creating a Double array with " + NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY +
                " items");
        dummyDoubleArray = CollectionsHelper.populateDoubleArray(NUMBER_ITEMS_TO_GENERATE_FOR_ARRAY);

        System.out.println();
        start = new Date();
        System.out.println("Starting sort with parallel - " + start);
        Arrays.parallelSort(dummyDoubleArray);
        stop = new Date();
        System.out.println("Stopping sort with parallel - " + stop);
        dummyDoubleArray = null;
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("-                                    L I S T                                   -");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Preparing Data - Creating a String List with " + NUMBER_ITEMS_TO_GENERATE_FOR_LIST +
                " items");
        dymmyStringList = CollectionsHelper.populateStringList(NUMBER_ITEMS_TO_GENERATE_FOR_LIST);
        System.out.println();
        System.out.println("Sorting String List");

        start = new Date();
        System.out.println("Starting sort without parallel - " + start);
        Collections.sort(dymmyStringList);
        stop = new Date();
        System.out.println("Stopping sort without parallel - " + stop);
        dymmyStringList.clear();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Sorting String List");

        start = new Date();
        System.out.println("Starting sort with parallel - " + start);
        dymmyStringList.parallelStream().sorted().collect(Collectors.<String>toList());
        stop = new Date();
        System.out.println("Stopping sort with parallel - " + stop);
        dymmyStringList.clear();


        System.out.println("--------------------------------------------------------------------------------");

        System.out.println("Preparing Data - Creating a Double List with " + NUMBER_ITEMS_TO_GENERATE_FOR_LIST +
                " items");
        dymmyStringList = CollectionsHelper.populateStringList(NUMBER_ITEMS_TO_GENERATE_FOR_LIST);
        System.out.println();
        System.out.println("Sorting Double List");

        start = new Date();
        System.out.println("Starting sort without parallel - " + start);
        Collections.sort(dymmyStringList);
        stop = new Date();
        System.out.println("Stopping sort without parallel - " + stop);
        dymmyStringList.clear();

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Sorting Double List");

        start = new Date();
        System.out.println("Starting sort with parallel - " + start);
        dymmyStringList.parallelStream().sorted().collect(Collectors.<String>toList());
        stop = new Date();
        System.out.println("Stopping sort with parallel - " + stop);
        dymmyStringList.clear();

    }
}
