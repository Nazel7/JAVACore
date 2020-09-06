package com.javaproject.algorithmbasic;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        int count = 0;
        for (int i = 2; i <= 60; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i + " is a prime number");
                if (count == 5) {
                    System.out.println("Exiting the loop" );
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
