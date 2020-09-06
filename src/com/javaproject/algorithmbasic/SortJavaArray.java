package com.javaproject.algorithmbasic;

import java.util.Scanner;

public class SortJavaArray {

    public static void main(String[] args) {
        int[] integerSets;
        integerSets= getIntegers(10);
        printArray(integerSets);
     int[] sorted   = sortIntegers(integerSets);

     for(int i= 0; i < sorted.length; i++){
        System.out.println("The sortedArray is "+sorted[i]);
     }
    }
    private static int[] getIntegers(int integers){
        Scanner scanner= new Scanner(System.in);
            System.out.println("Enter the " +integers+" Integers \r");
            int[] values= new int[integers];
            for(int i=0; i< values.length; i++){
                values[i]= scanner.nextInt();
            }
            return values;
    }
    private static void printArray(int[] array){
        for(int i= 0; i < array.length; i++)
        System.out.println("The value of array position "+ i+" is " +array[i]);
    }
    private static int[] sortIntegers(int[] sortArray) {
        int temp;
        for(int i= 0; i < sortArray.length; i++){
            for(int j= i+1; j < sortArray.length; j++){
               if(sortArray[i] > sortArray[j]) {
                   temp = sortArray[j];
                   sortArray[j] = sortArray[i];
                   sortArray[i] = temp;
               }

            }
//            System.out.print("The sorted value of the input array is "+sortArray[i]+"\n");
        }
        return sortArray;
    }
}
