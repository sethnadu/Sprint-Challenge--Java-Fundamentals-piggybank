package com.piggybank;

public class Quarter extends AbstractCoins
{
    public Quarter(int number)
    {
        super(.25, number, "Quarters");
    }
    public Quarter()
    {
        super(.25, 1, "Quarter");
    }


}
