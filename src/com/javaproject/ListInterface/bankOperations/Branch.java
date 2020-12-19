package com.javaproject.ListInterface.bankOperations;

import java.util.ArrayList;
import java.util.Scanner;

public class Branch {
    private String branchName;
    private ArrayList<BankCustomer> branchCustomer = new ArrayList<>();

    public Branch(String branchName, BankCustomer initialCustomer) {
        this.branchName = branchName;
        this.branchCustomer.add(initialCustomer);
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<BankCustomer> getBranchCustomer() {
        return branchCustomer;
    }

    private int findCustomer(String customerName) {
        BankCustomer customer;
        for (int i = 0; i < this.branchCustomer.size(); i++) {
            customer = this.branchCustomer.get(i);
            if (customer.getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public void addNewCustomer(BankCustomer customer) {
        Scanner input = new Scanner(System.in);
        int findCustomer = findCustomer(customer.getName());
        if (findCustomer >= 0) {
            System.out.println("The customer " + customer.getName() + " already exist in the customer list");
            return;
        }
        this.branchCustomer.add(customer);
        System.out.println("Customer " + customer.getName() + " added successfully");
        for (int i = 0; i < branchCustomer.size(); i++) {
            System.out.println("Do you want to add transaction to this customer: \r");
            String response = input.nextLine();
            if (response.equals("Yes") || response.equals("YES") || response.equals("yes")) {
                addTransactions(customer);
            }
            else{
                System.out.println("Customer is not ready for any further transaction");
                return;
            }
        }

    }

    private void addTransactions(BankCustomer customer) {
        Scanner scanTransaction = new Scanner(System.in);
        System.out.println("Enter transaction amount: \r");
        double transaction = scanTransaction.nextDouble();
        customer.customerTransactions(transaction);
        System.out.println("Customer " + customer.getName() + " transaction of " + transaction + "$ added to transaction list");
    }

    public void addTransactions(String customerName) {
        Scanner inputTransaction = new Scanner(System.in);
        int findCustomer = findCustomer(customerName);
        if (findCustomer >= 0) {
            System.out.println("Enter customer transaction: ");
            double transaction = inputTransaction.nextDouble();
            this.branchCustomer.get(findCustomer).customerTransactions(transaction);
            System.out.println("Transaction of " + transaction + " added to existing customer " + customerName);
        }
    }

    public void printBranchCustomerTransaction(String branchCustomerName){
        int findBranchCustomerName= findCustomer(branchCustomerName);
        if(findBranchCustomerName >= 0){
            for(int i = 1; i < this.branchCustomer.size(); i++){
                System.out.println(this.branchCustomer.get(findBranchCustomerName).getCustomersTransactions());
            }
            return;
        }
        System.out.println("Customer "+branchCustomerName+ " do not exist for this branch");
    }

    public void printBranchCustomerName(){
        for(int i= 0; i < this.branchCustomer.size(); i++){
        System.out.println(this.branchCustomer.get(i).getName());
        }
    }

    public static Branch createBranch(String branchName, BankCustomer branchCustomers) {
        return new Branch(branchName, branchCustomers);
    }
}
