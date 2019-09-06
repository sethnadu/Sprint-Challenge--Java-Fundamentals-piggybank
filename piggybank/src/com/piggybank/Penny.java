package com.piggybank;

public class Penny extends AbstractCoins
{
    public Penny(int number)
    {
        super(0.01, number, "Pennies");
    }
    public Penny()
    {
        super(0.01, 1, "Penny");
    }



}
