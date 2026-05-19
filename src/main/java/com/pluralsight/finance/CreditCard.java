package com.pluralsight.finance;

public class CreditCard {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void charge(){

    }
    public void pay(){

    }
    public double getValue(){
        return balance;
    }
}

