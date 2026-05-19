package com.pluralsight.finance;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double debt;

    public CreditCard(String name, String accountNumber, double debt) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.debt = debt;
    }
    public void charge(double amount){
        this.debt += amount;

    }
    public void pay(double amount){
        this.debt -= amount;

    }
    public double getValue(){
        return -this.debt;
    }
}

