package com.piggybank;

public class Nickel extends AbstractCoins
{
    public Nickel(int number)
    {
        super(0.05, number, "Nickels");
    }
    public Nickel()
    {
        super(0.05, 1, "Nickel");
    }



}
