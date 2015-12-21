package com.features.java8.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by kvillaca on 12/21/2015.
 */
public class DateTime {



    public static void main(String[] args) {

        System.out.println("Calculating days");
        LocalDate today = LocalDate.now();
        System.out.println("Local Date today " + today);
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        System.out.println("Local Date get last day of month and subtract two days " + payday);


        System.out.println();
        System.out.println("Calculating year(s)");
        LocalDate dob = LocalDate.of(2010, Month.JANUARY, 10);
        System.out.println("Local Date set a Date of Birthday " + dob);
        LocalDate eithteenYears = dob.plusYears(18);
        System.out.println("Local Date get the 18th Birthday " + eithteenYears);
        LocalDate eithteenYearsAndSixDays = dob.plusYears(18).plusDays(6);
        System.out.println("Local Date get the 18th Birthday plus 6 days " + eithteenYearsAndSixDays);


        System.out.println();
        System.out.println("Calculating Date and Time");
        System.out.println("Local Date Time, Now " + LocalDateTime.now());
        System.out.println("Local Date Time, Now plus 10 minutes " + LocalDateTime.now().plusMinutes(10));
        System.out.println("Local Date Time, Now plus 10 months " + LocalDateTime.now().plusMonths(10));

        System.out.println();
        System.out.println("For more info and tutorial, please refer to the following link");
        System.out.println("https://docs.oracle.com/javase/tutorial/datetime/overview/index.html");
    }
}
