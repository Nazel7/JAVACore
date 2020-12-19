package com.javaproject.ListInterface.bankOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private ArrayList<Branch> bankBranch;

    public Bank(String bankName) {
        this.bankName = bankName;
        bankBranch= new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBank() {
        return bankBranch;
    }

    public void addBranch(String name, BankCustomer customers) {
        int findBranch= findBranch(name);
        if(findBranch >= 0){
            System.out.println("The bank branch "+name+ " already exist for this com.javaproject.ListInterface.musicplaylist.bankOperations.Bank.");
            return;
        }
        Branch bankBranch = Branch.createBranch(name, customers);
        this.bankBranch.add(bankBranch);
        System.out.println("The " + this.bankName + " new branch " + bankBranch.getBranchName() + " added successfully.");
    }

    public int findBranch(String branchName) {
        Branch findBranch;
        for (int i = 0; i < bankBranch.size(); i++) {
            findBranch = this.bankBranch.get(i);
            if (findBranch.getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }

    public void addNewCustomerToBranch(String branchName) {
        Scanner scanName = new Scanner(System.in);
        int findBranch = findBranch(branchName);
        if (findBranch >= 0) {
            System.out.println("Enter new customer name: ");
            String newCustomerName = scanName.nextLine();
            System.out.println("Enter new customer initial transaction: ");
            double newCustomerTransaction = scanName.nextDouble();
            BankCustomer newCustomer = BankCustomer.createCustomers(newCustomerName, newCustomerTransaction);
            this.bankBranch.get(findBranch).addNewCustomer(newCustomer);
            System.out.println("The new customer " + newCustomerName + " has been added to " + branchName+ " branch");
            return;
        }
        System.out.println("The " + branchName + " not found.");

    }

    public void addNewTransactionToBranchCustomer(String branchName) {
        Scanner inputBranch = new Scanner(System.in);
        int findBranch = findBranch(branchName);
        if (findBranch >= 0) {
            System.out.println("Enter existing customer name:\r");
            String existingCustomerName = inputBranch.nextLine();
            this.bankBranch.get(findBranch).addTransactions(existingCustomerName);
        }
    }

   public void printBranchCustomerTransaction(String branchName){
       Scanner inputName = new Scanner(System.in);
       int findBranch= findBranch(branchName);
       if(findBranch >= 0){
           System.out.println("Enter com.javaproject.ListInterface.bankOperations.Branch customer name: ");
           String customerName= inputName.nextLine();
           this.bankBranch.get(findBranch).printBranchCustomerTransaction(customerName);
       }
   }

    public void printBranchCustomerName(String branchName){
        int findBranch= findBranch(branchName);
        if(findBranch >= 0){
            System.out.println("The following are the list of customer for "+branchName);
            this.bankBranch.get(findBranch).printBranchCustomerName();
        }
    }
}