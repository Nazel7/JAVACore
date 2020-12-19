package com.javaproject.functionControl;

public class TestingNumberToWord {
    public static void main(String[] args) {
//        numberToWords(100100000);
        System.out.println(getDigitCount(0));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int reverse = 0;
        int digit = 0;
        int real = 0;
        int leadingZeros = 0;
        while (number > 0) {
            digit = number % 10;
            reverse = (reverse * 10) + digit;
            number /= 10;
            if (reverse == 0 && leadingZeros== 0) leadingZeros++;
            else if(leadingZeros > 0 && reverse == 0 && number > 0) leadingZeros++;
        }
        while (reverse > 0) {
            real = (reverse % 10);
            switch (real) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            reverse/= 10;

        }
        if (leadingZeros > 0) while(leadingZeros > 0) {
            System.out.println("Zero");
            leadingZeros--;
        }
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count= 0;
        int reverse= 0;
        while(number > 0){
            int digit= number % 10;
            reverse= (reverse * 10) + digit;
            if(reverse==0 && count==0) count++;
            else if(reverse == 0 && number > 0 )

            number/= 10;
        }
        return count;
    }
}
