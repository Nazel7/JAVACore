package com.javaproject.algorithmbasic;

public class InterviewPrintNthNo {
    public static void main(String[] args) {

    }
    public static void printNo(int n) {
        // this logic is based on recursive concatination where the program concat 0,1----nth
        // using number 1 to 9 as a base number to generate the new numbers.
        String b;
        String c;
        String d;
        int count= 0;
        int baseNo= 9;

        for (int i = 0; i < baseNo; i++) {
            b= String.valueOf(i);
            for (int j = 0; j <= n; j++) {
                c= String.valueOf(j);
                d   =b.concat(c);
                 count++;
                int newNo= Integer.parseInt(d);
               if(newNo <= n && count <= n+1){
                System.out.println(newNo);
               }
            }
        }

    }

}
