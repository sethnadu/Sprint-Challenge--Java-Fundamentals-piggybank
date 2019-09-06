package com.piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList <AbstractCoins> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.print(piggyBank.toString());

        double total = 0;
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        for (AbstractCoins m : piggyBank)
        {
            total += m.getTotal();
        }
        
        System.out.println("The piggy bank holds " + fp.format(total));


//        System.out.println("The piggy bank holds " + fp.format(total));
//        System.out.print(piggyBank.toString());

    }
}
