package com.javaproject.algorithmbasic;

public class ReturnLargestPrime {
    public static void main(String[] args) {
//        System.out.println(prime(5));
        System.out.println(getLargestPrime(1));
    }

    public static int getLargestPrime(int number) {
        if(number <=1){
            return -1;
        }
        int largestPrime = 2;
        for (int i = 2; i <= number; i++) {
            int numb = number % i;
            boolean isPrime = true;
            for (int j = 2; j <= (long) Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (numb == 0 && isPrime && i > largestPrime) largestPrime = i;
        }
        return largestPrime;
    }
}
