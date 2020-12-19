package com.javaproject.functionControl;

public class MyJavaSecond {
    public static void main(String[] args) {
        int totalScore= calculateScore(500,6,200);
        System.out.println("Final Score" + totalScore);
        
        }

    public static int calculateScore(int score,int levelCompleted,int bonus) {
        if (score >= 300 && score <= 400) {
            int finalScore = (score + bonus) * levelCompleted;
            System.out.println("Your Score is " + finalScore + "this is a high score.");
        }
        else if(score == 500) {
            score = 500;
            levelCompleted = 7;
            bonus = 300;
            int f2 = (score + bonus) * levelCompleted;
            System.out.println("Your Second Final Score is" + f2);
            return f2;
        }
        else {
            System.out.println("Your got a low score");
        }
        return -1;
    }

}