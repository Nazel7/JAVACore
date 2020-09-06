package com.javaproject.algorithmbasic;

public class PrintFactors {
    public static void main(String[] args) {
        printFactors(-1);

    }
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        for(int i=1; i <= number; i++) {
            int factors = number % i;
            if (factors == 0) {
                System.out.println(i);

            }
        }
    }
}
