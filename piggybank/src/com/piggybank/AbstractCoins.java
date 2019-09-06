package com.piggybank;

public abstract class AbstractCoins
{
     double value;
     int number;
     String name;

    public AbstractCoins(double value, int number, String name)
    {
            this.number = number;
            this.name = name;
            this.value = value;

    }

    public AbstractCoins()
    {
        this.number = 1;

    }

    public double getTotal()
    {
        return value * number;
    }

//    public double removeMoney(double remove)
//    {
//        double total = 0;
//        if (remove > 1.00)
//        {
//            piggyBank.remove(new Dollar(1));
//            total -= 1.00;
//        }
//        if (remove > .25)
//        {
//            piggyBank.remove(new Quarter(1));
//            total -= 0.25;
//        }
//        if (remove > .10)
//        {
//            piggyBank.remove(new Dime(1));
//            total -= 0.10;
//        }
//        if (remove > .05)
//        {
//            piggyBank.remove(new Nickel(1));
//            total -= 0.05;
//        }
//        if (remove > .01)
//        {
//            piggyBank.remove(new Penny(1));
//            total -= 0.01;
//        }
//
//    }

    @Override
public String toString()
{
    return "\n" + number + " " + name;
}



}
