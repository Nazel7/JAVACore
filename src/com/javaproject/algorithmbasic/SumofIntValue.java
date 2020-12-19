package com.javaproject.algorithmbasic;

import java.util.Scanner;

public class SumofIntValue {
    public static void main(String[] args) {

        int count = 0;
        int sum= 0;
        while(count < 10){
           int od= count + 1;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number #" +od +" :" );
            boolean hasNextInt = input.hasNextInt();
            if(count >=0 && !hasNextInt){
                System.out.println("Invalid Number");
            }
            if(hasNextInt){
                int number= input.nextInt();
                count++;
                sum+= number;
                if(count==10) {
                    System.out.println("Sum of number : " + sum);
                    input.close();
                }
            }

        }


    }
}