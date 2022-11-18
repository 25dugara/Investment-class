package com.company;

public class CD extends Investment
{
    private double amount;
    private double rate;
    private double term;

    public CD(String name, int age, String phoneNumber, String ssn, double amount, double rate, double term) {
        super(name, age, phoneNumber, ssn);
        this.amount = amount;
        this.rate = rate;
        this.term = term;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }



    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }



    void calcValue()
    {
        setTotalValue((amount*(term * (rate/360))));
        //cannot access totalValue directly because its private
    }
    public String toString()
    {
        return ("Name: " + getName() +"\nTotal value: " + getTotalValue() + "\nType: CD");
    }
}
