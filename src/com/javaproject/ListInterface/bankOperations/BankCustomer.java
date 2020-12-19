package com.javaproject.ListInterface.bankOperations;

import java.util.ArrayList;

public class BankCustomer {
    private String name;
    private ArrayList<Double> customersTransactions= new ArrayList<>(0);



    public BankCustomer(String name, double transaction) {
        this.name = name;
        this.customersTransactions.add(transaction);

    }
    public void customerTransactions(double customersTransactions) {
        this.customersTransactions.add(customersTransactions);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getCustomersTransactions() {
        return customersTransactions;
    }

    public static BankCustomer createCustomers(String name, double transaction) {
        return new BankCustomer(name, transaction);
    }

}
