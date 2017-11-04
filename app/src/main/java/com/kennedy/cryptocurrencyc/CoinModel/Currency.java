package com.kennedy.cryptocurrencyc.CoinModel;

/**
 * Created by Kennedy on 01-Nov-17.
 */

public class Currency {
    private String name;
    private double rate;


    public Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
}
