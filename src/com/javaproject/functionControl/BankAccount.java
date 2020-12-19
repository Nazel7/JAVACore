package com.javaproject.functionControl;

public class BankAccount {
    private String number;
    private String customerName;
    private String email;
    private double balance;
    private String phoneNumber;

    public static void main(String[] args) {
        BankAccount account= new BankAccount();
        account.depositFund(200.0);
        account.withdrawFund(100.0);
    }
    public void depositFund(double deposit){
        this.balance+= deposit;
    }
    public void withdrawFund(double withdraw){
        if(withdraw > this.balance){
            System.out.println("Insufficient funds, account balance is " + this.balance);
        }
        else{
        this.balance-= withdraw;
            System.out.println("Amount withdraw is " + withdraw + "account balance is now " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
