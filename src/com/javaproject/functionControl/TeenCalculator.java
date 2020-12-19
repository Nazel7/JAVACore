package com.javaproject.functionControl;

public class TeenCalculator {
    public static void main(String[] args) {
        Boolean teen= TeenCalculator.hasTeen(20, 45, 15);
        System.out.println("has Teen? : "+ teen);


    }
    public TeenCalculator(){

    }
    public static boolean hasTeen(int number, int number1, int number2){
        if(number >= 13 && number <= 19 || number1 >= 13 && number1 <=19 || number2 >= 13 && number2 <= 19){
            return true;
        }
        return false;
    }
    public static boolean isTeen(int number){
        if(number >= 13 && number <= 19){
            return true;
        }
        return false;
    }
}
