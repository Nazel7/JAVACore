package com.javaproject.algorithmbasic;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11811));

    }

    public static boolean isPalindrome(int number) {
        if(number % 10 == 0){
            return false;
        }
        int reverse = 0;
        while (number !=0 ) {
            int palindrome1 = number % 10;
            reverse = (reverse * 10) + palindrome1;
            if(number== reverse) return true;
            number /= 10;
            if(number== reverse)return true;
        }
        return false;
    }
}

