package com.javaproject.composition.roomAttribute.floorcarpetprice;

public class MainBankAWallPointCalc {
    public static void main(String[] args) {


        Floor floor= new Floor(5.4, 4.5);
        Carpet carpet= new Carpet(4);
        Calculator calculator= new Calculator(floor, carpet);
        System.out.println("Totla = " + calculator.getTotalCost());

    }

}
