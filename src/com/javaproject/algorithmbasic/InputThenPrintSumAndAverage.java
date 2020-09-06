package com.javaproject.algorithmbasic;

import java.util.Scanner;

public class InputThenPrintSumAndAverage {
    public static void main(String[] args){
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        double count= 0;
        int sum= 0;
        long average= 0;
        Scanner input = new Scanner(System.in);
        while(count >= 0 ) {
            System.out.println("Enter number:\n");
            boolean hasNextInt = input.hasNextInt();
            if(hasNextInt){
                count++;
                int numb= input.nextInt();
                sum+= numb;
                average =  Math.round(sum/ count);
            }
            else{
                System.out.println("SUM = " +sum + " AVG = " +average);
                break;
            }
        }


    }
}
