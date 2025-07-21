package com.example.day7;

public class EuroToTomanService implements CurrencyConverterService
{
    double eur = 110000;
    
    @Override
    public double convert(double amount)
    {
        double convertTo = amount * eur;
        return convertTo;
    }

    @Override
    public String getCurrencyName()
    {
        return "EURO";
    }
}
