package com.javaproject.algorithmbasic;

import java.util.Scanner;

public class PrintMinArrayElement {
    private static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: \r");
        int count= input.nextInt();
        input.nextLine();

        int[] integersArray = readIntegers(count);
        int[] findMin = findMin(integersArray);
        System.out.println(findMin[0]);

//for(int i= 0; i < findMin.length; i++){
//        System.out.println ("The minArray : " +findMin[i]);
//}
    }

    private static int[] readIntegers(int count) {
        System.out.println("Enter the " + count + " Elements:\r");
        int[] readInputs = new int[count];
        for (int i = 0; i < readInputs.length; i++) {
            readInputs[i] = input.nextInt();
        }
        return readInputs;
    }


    private static int[] findMin(int[] array) {
        int tempe;
        for(int i= 0; i < array.length; i++){
            for(int j= i+1; j < array.length; j++){
                if(array[j] < array[i]){
                   tempe= array[j];
                   array[j]= array[i];
                   array[i]= tempe;

                }
            }

        }
        return new int[]{array[0]};
        }
    }
