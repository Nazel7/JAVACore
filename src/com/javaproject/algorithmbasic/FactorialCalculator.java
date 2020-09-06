package com.javaproject.algorithmbasic;

public class FactorialCalculator {
    public static void main(String[] args) {
        factorial(6);
    }
    private static void factorial(int n){
        int product= 1;
        for(int i= 1; i <= n; i++){
            product *= i;
            if(i == n){
                System.out.println("Factorial " + n + " = " + product);
            }
        }
    }
}
