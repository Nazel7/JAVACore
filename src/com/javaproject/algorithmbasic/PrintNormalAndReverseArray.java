package com.javaproject.algorithmbasic;

import java.util.Arrays;

public class PrintNormalAndReverseArray {
    public static void main(String[] args) {
        int[] reverse = {1, 3, 3, 4, 4, 6, 7, 8, 1};
        System.out.println(Arrays.toString(reverse));
        reverse(reverse);
        System.out.println(Arrays.toString(reverse));
    }

    public static void reverse(int[] array) {
        int halfLenght = array.length / 2;
        int lastElement = array.length - 1;
        int first;
        for (int i = 0; i < halfLenght; i++) {
            first = array[i];
            array[i] = array[lastElement-i];
            array[lastElement-i] = first;
        }

    }


}
