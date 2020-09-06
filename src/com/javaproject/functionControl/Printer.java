package com.javaproject.functionControl;

public class Printer {
    public static void main(String[] args) {
        Printer printer = new Printer(false);
        printer.fillTonner(90 );
        printer.print(180);
        printer.print(20);
        printer.print(30);
        printer.print(20);
        printer.print(10);
        printer.print(10);
        printer.print(1);
    }

    private int tonnerLevel;
    boolean isDuplexPrinter;

    public Printer(boolean isDuplexPrinter) {
        this.isDuplexPrinter = isDuplexPrinter;
        this.tonnerLevel = 0;
    }

    public void fillTonner(int tonnerLevel) {
        this.tonnerLevel = tonnerLevel;
    }

    public void print(int pages) {
        if (pages < 1 || tonnerLevel < 1) {
            System.out.println("No more Tonner or paper not inserted");
            return;
        }
     if (isDuplexPrinter) {
            int totalSheets = (int) Math.ceil(pages / 2);
            int unPrintedPages = (tonnerLevel < totalSheets ? (totalSheets - tonnerLevel)*2 : 0);
            if (unPrintedPages > 0) {
                System.out.printf("The Duplex printed %d pages of %d with total sheet of %d and unprinted pages of %d\n", tonnerLevel * 2, pages, tonnerLevel, unPrintedPages );

            }
//
            else {
                tonnerLevel -= totalSheets;
                System.out.println("The Duplex com.javaproject.functionControl.Printer printed " + pages + " page(s) on " + totalSheets + " sheet(s) of paper(s)");
            }
//
        }
     else {
          int totalSheets = (int) Math.ceil(pages / 2);
          int unPrintedPages = (tonnerLevel < totalSheets ? (totalSheets - tonnerLevel)*2 : 0);
          if (unPrintedPages > 0) {
              System.out.printf("The printer printed %d pages of %d with total sheet of %d and unprinted sheet of %d\n", tonnerLevel *2, pages, tonnerLevel*2, unPrintedPages);
              tonnerLevel = 0;
          }
          else {
              tonnerLevel -= totalSheets;
              System.out.println("The com.javaproject.functionControl.Printer printed " + pages + " page(s) on " + pages + " sheet(s) of paper(s)");
          }
        }
    }
}
