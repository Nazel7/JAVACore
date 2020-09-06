package com.javaproject.concurrentInJava.concurrent;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountOpeation {
    private double balance;
    private String accountNumber;
   private Lock lock;

    public static void main(String[] args) {
        AccountOpeation account = new AccountOpeation(1000, "2132122323");
        new Thread(new Runnable() {
            @Override
            public void run() {
                Random random= new Random();
                try {
                    account.deposit(300);
                    account.withdraw(50);

                    Thread.sleep(random.nextInt(100));
                }catch (InterruptedException e){
                    System.out.println("exception A");
                }



            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Random random= new Random();
                try{
                    account.deposit(203.75);
                    account.withdraw(100);
                    Thread.sleep(random.nextInt(100));
                }catch (InterruptedException e){
                    System.out.println("exception A");
                }


            }
        }).start();

    }

    public AccountOpeation(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.lock= new ReentrantLock();
    }

    public void deposit(double amount) {
        boolean status= false;
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try{
                    this.balance += amount;
                    status= true;
                    System.out.println("Depositing balance: "+ this.balance);
                }finally {
                    lock.unlock();
                }
            }else{
                System.out.println("could not get the lock to the console");
            }
        }catch (InterruptedException e){
            System.out.println();
        }
        System.out.println("Transaction status= "+status);
    }

    public void withdraw (double amount) {
        boolean status= false;
       try{
           if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
               try{
                   this.balance -= amount;
                   status= true;
                   System.out.println("Withdrawing balance: "+ this.balance);
               }finally {
                   lock.unlock();
               }
           }else{
               System.out.println("could not get the lock to the console");
           }

       }catch (InterruptedException e){
           System.out.println();
       }
        System.out.println("Transaction status= "+status);

    }
    public String getAccountNumber(){
        lock.lock();
        try {
            return this.accountNumber;
        }finally {
            lock.unlock();
        }

    }
    public void printAccountNumber(){
        System.out.println("Account Number: "+ this.accountNumber);
    }
}
