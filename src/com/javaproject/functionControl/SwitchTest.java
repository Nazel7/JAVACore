package com.javaproject.functionControl;

public class SwitchTest {
    public static void main(String[] args) {
        char letterOne= 'C';
        switch(letterOne){
            case 'A':
                System.out.println("It is letter A");
                break;
            case 'B':
                System.out.println("It is letter B");
                break;
            case 'C':
                System.out.println("It is letter C");
                break;
            case 'D':
                System.out.println("It is letter D");
                break;
            case 'E':
                System.out.println("It is letter E");
                break;
                default:
                    System.out.println("The letter A, B, C, D, E is not found");

        }
    }
}
