package com.javaproject.functionControl;

public class SecondAndMinute {
    private static final String INVALID_VALUE= "Invalid Value";
    public static void main(String[] args) {
        String rightError = getDurationString(100, 59);
        System.out.println(rightError);
        String rightError1 = getDurationString(3945);
        System.out.println(rightError1);
    }

    public static String getDurationString(double minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hour = (int) minutes / 60;
            int remainder = (int) minutes % 60;
            String intConvert = String.valueOf(hour);
            String intConvert1 = String.valueOf(remainder);
            String intConvert2 = String.valueOf(seconds);
            return intConvert + "h " + intConvert1 + "m " + intConvert2 + "s";
        }
        return INVALID_VALUE;
    }

    public static String getDurationString(double seconds) {
        if (seconds >= 0) {
            int minutes = (int) seconds / 60;
            int remainder = (int) seconds % 60;
            return getDurationString(minutes, remainder);
        }
        return INVALID_VALUE;
    }
}
