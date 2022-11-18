package com.company;

public abstract class Investment implements Comparable<Investment>
{
    private String name;
    private int age;
    private String  phoneNumber;
    private double totalValue;
    private String ssn;

    public Investment(String name, int age, String phoneNumber, String ssn) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.ssn = ssn;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    protected void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getTotalValue() {
        return totalValue;
    }
    abstract void calcValue();

    public int compareTo(Investment t)
    {
        if (getTotalValue() > t.getTotalValue())
        {
            return 1;
        }
        else if (getTotalValue() < t.getTotalValue())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
