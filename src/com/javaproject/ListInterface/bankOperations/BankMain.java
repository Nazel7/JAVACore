package com.javaproject.ListInterface.bankOperations;

import java.util.Scanner;

public class BankMain {
    private static Scanner input = new Scanner(System.in);
    private static Bank bank = new Bank("Zenith com.javaproject.ListInterface.musicplaylist.bankOperations.Bank");

    public BankMain() {
        System.out.println("com.javaproject.ListInterface.musicplaylist.bankOperations.Bank has no customers");
    }

    public static void main(String[] args) {
        boolean quit= false;
        while(!quit){
            System.out.println("Enter bank operation you do like to perform: ");
            int bankOpen= input.nextInt();
            switch (bankOpen){
                case 0:
                    System.out.println("com.javaproject.ListInterface.musicplaylist.bankOperations.Bank is not open at this time");
                    quit= true;
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    findBranch();
                    break;
                case 3:
                    addNewCustomerToBranch();
                    break;
                case 4:
                    addNewTransactionToBranchCustomer();
                    break;
                case 5:
                    printBranchCustomerTransaction();
                    break;
                case 6:
                    printBranchCustomerName();
                    break;
            }
        }

    }

    private static void addBranch() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter com.javaproject.ListInterface.bankOperations.Branch name: ");
        String nameOfBranch = scanner.nextLine();
        int findBranch = bank.findBranch(nameOfBranch);
        if (findBranch >= 0) {
            System.out.println("The com.javaproject.ListInterface.musicplaylist.bankOperations.Bank com.javaproject.ListInterface.bankOperations.Branch" +nameOfBranch+ " already exist");
            return;
        }
        System.out.println("Enter initial customer name: ");
        String initialCustomerName = scanner.nextLine();
        System.out.println("Enter initial customer transaction: ");
        double initialCustomerTransaction = scanner.nextDouble();
        BankCustomer initialCustomer = BankCustomer.createCustomers(initialCustomerName, initialCustomerTransaction);
        bank.addBranch(nameOfBranch, initialCustomer);

    }

    private static void findBranch(){
        Scanner scanBranch= new Scanner(System.in);
        System.out.println("Enter com.javaproject.ListInterface.bankOperations.Branch name: ");
        String branchName= scanBranch.nextLine();
        int findBranch= bank.findBranch(branchName);
        System.out.println(findBranch);
        if(findBranch >=0 ){
            System.out.println("The com.javaproject.ListInterface.musicplaylist.bankOperations.Bank branch "+branchName+" exist for "+bank.getBankName());
            return;
        }
        System.out.println("com.javaproject.ListInterface.musicplaylist.bankOperations.Bank branch "+branchName+ " not found");
    }

    private static void addNewCustomerToBranch(){
        Scanner scanBranchName= new Scanner(System.in);
        System.out.println("Enter com.javaproject.ListInterface.bankOperations.Branch Name: ");
        String branchName= scanBranchName.nextLine();
        bank.addNewCustomerToBranch(branchName);
    }

    private static void addNewTransactionToBranchCustomer(){
        Scanner scanBranchCustomer= new Scanner(System.in);
        System.out.println("Enter com.javaproject.ListInterface.bankOperations.Branch name: ");
        String branchName= scanBranchCustomer.nextLine();
        bank.addNewTransactionToBranchCustomer(branchName);
    }

    private static void printBranchCustomerTransaction(){
        Scanner scanTransaction= new Scanner(System.in);
        System.out.println("Enter com.javaproject.ListInterface.bankOperations.Branch name: ");
        String branchName= scanTransaction.nextLine();
        bank.printBranchCustomerTransaction(branchName);
    }

    private static void printBranchCustomerName(){
        Scanner scanCustomerName = new Scanner(System.in);
        System.out.println("Enter com.javaproject.ListInterface.bankOperations.Branch name: ");
        String branchName= scanCustomerName.nextLine();
        bank.printBranchCustomerName(branchName);
    }
}
