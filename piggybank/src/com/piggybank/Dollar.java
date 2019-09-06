package com.piggybank;

public class Dollar extends AbstractCoins
{
    public Dollar(int number)
    {
        super(1.00, number, ("$" + number));
    }
    public Dollar()
    {
        super(1.00, 1, "$1");
    }



    @Override
    public String toString()
    {
        return "\n" + name;
    }
}
