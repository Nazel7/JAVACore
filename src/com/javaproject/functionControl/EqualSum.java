package com.javaproject.functionControl;

public class EqualSum {
    public static boolean hasEqualSum(int number, int number1, int number2){
        int addNumb= number + number1;
        if(addNumb== number2){
          return true;
        }
        return false;
    }
}
