package com.javaproject.functionControl;

public class CanPack {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 5));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int real = (bigCount * 5);
        int doubleReal = real + smallCount;
        if (doubleReal >= goal && real <= goal) {
            return true;
        }
        else if(smallCount > 0 && real > goal){
            return true;
        }

        return false;
    }
}
