package com.javaproject.functionControl;

public class YearAndDay {
    public static void main(String[] args) {
        printYearsAndDays(10000);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long doYear = (minutes / 1440) * 1 / 365;
            long doDay = (minutes / 1440) * 1 % 365;
            System.out.println(minutes + " min = " + doYear + " y and " + doDay + " d");
        }
    }
}
