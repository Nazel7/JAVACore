package com.javaproject.algorithmbasic;

public class IsPerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            count++;
            int factors = number % i;
            if (factors == 0) {
                sum += i;
                if (count == number) {
                    sum -= count;
                }
            }

        }
        if (sum != number) {
//            sum-=count;
//        System.out.println(sum);
            return false;
        } else {
            return true;
        }
    }
}