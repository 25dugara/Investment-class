package com.company;

public class Main {

    public static void main(String[] args) {

        Investment I[] = new Investment[3];


        I[0] = new CD("Casey", 21, "973-555-3434","111-22-3333",1000.0,90,8.5);
        I[1] = new mutualFund("John", 21, "973-555-3434","111-22-3333",1000.0,10.50);
        I[2] = new CD("Farrell", 21,  "973-555-3434","111-22-3333",1000.0,90,6.5);

        I[0].calcValue();
        I[1].calcValue();
        I[2].calcValue();


        if(I[0].compareTo(I[2]) > 0)
        {
            System.out.println(I[0].getName() + " Has More Invested");
            System.out.println(I[0].toString());
        }
        else
        {
            System.out.println(I[1].getName() + " Has More Invested");
            System.out.println(I[1].toString());
        }


    }
}
