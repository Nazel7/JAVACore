package com.javaproject.functionControl;

public class SumUpForLoop {
    public static void main(String[] args) {
        int count= 0;
        int sum= 0;
        System.out.println("Found numbers are:");
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
                sum+= i;
                System.out.println(i);
                if(count == 10){
                    System.out.println("The sum of the numbers found is "+sum);
                    break;
                }
            }
        }

    }

}