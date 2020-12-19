package com.javaproject.functionControl;

public class LeapYearWithMethod {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(2, 2028));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month >= 1 && month <= 12 && year >= 1 && year <= 9999) {
            if (isLeapYear(year)) {
                switch (month) {
                    case 1:
                        return 31;
                    case 2:
                        return 29;
                    case 3:
                        return 31;
                    case 4:
                        return 30;
                    case 5:
                        return 31;
                    case 6:
                        return 30;
                    case 7:
                        return 31;
                    case 8:
                        return 31;
                    case 9:
                        return 30;
                    case 10:
                        return 31;
                    case 11:
                        return 30;
                    case 12:
                        return 31;

                }
            } else if (month == 1) {
                return 31;
            } else if (month == 2) {
                return 28;
            } else if (month == 3) {
                return 31;
            } else if (month == 4) {
                return 30;
            } else if (month == 5) {
                return 31;
            } else if (month == 6) {
                return 30;
            } else if (month == 7) {
                return 31;
            } else if (month == 8) {
                return 31;
            } else if (month == 9) {
                return 30;
            } else if (month == 10) {
                return 31;
            } else if (month == 11) {
                return 30;
            } else {
                return 31;
            }

        }
        return -1;
    }

}
