package com.company;

public class mutualFund extends Investment
{
    private double units;
    private double unitValue;

    public mutualFund(String name, int age, String phoneNumber, String ssn, double units, double unitValue) {
        super(name, age, phoneNumber, ssn);
        this.units = units;
        this.unitValue = unitValue;
    }


    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        this.units = units;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitvalue) {
        this.unitValue = unitvalue;
    }

    void calcValue()
    {
        setTotalValue(units * unitValue);
    }

    public String toString()
    {
        return ("Name: " + getName() +"\nTotal value: " + getTotalValue() + "\nType: Mutal Fund");
    }
}
