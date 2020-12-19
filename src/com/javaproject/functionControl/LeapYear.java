package com.javaproject.functionControl;

public class LeapYear {
    public static void main(String[] args) {
        int pound= 200;
        double kilograms= 0.45359237d * pound;
        System.out.println("Pound =" + kilograms);

        char myChar= '\u00AE';
        System.out.println(myChar);
        double myVariable= 20;
        double myVariable1= 80;
        double result= (myVariable + myVariable1)* 25;
        double total= result % 40;
        if(total <= 20) {
            System.out.println("Total was over the limit");

            boolean gameOver= true;
            int score= 800;
            int levelCompleted= 5;
            int bonus= 100;
            if(gameOver) {
                int finalScore= score + (levelCompleted * bonus);
                System.out.println("Your final score was " + finalScore);

                score= 10000;
                levelCompleted= 8;
                bonus= 200;
                int secondScore= score + (levelCompleted * bonus);
                if(gameOver){
                    System.out.println("Your second final score was " + secondScore);
                }
            }
        }
    }
}
