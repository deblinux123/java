package com.example.day7;

public class DollarToTomanService implements CurrencyConverterService
{
    private double toman = 90000.0;
    @Override
    public double convert(double amount)
    {
        double convertTo = amount * toman;
        return convertTo;
    }    

    @Override
    public String getCurrencyName()
    {
        return "Dollar";
    }
}
