package com.javaproject.algorithmbasic;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(16));

        int number= 4;
        int finishNumber= 20;
        int sum= 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            sum+= number;
            System.out.println("This is even number " + number);
            System.out.println("The total sum of even number = " + sum);
        }
    }

    private static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }


    }
