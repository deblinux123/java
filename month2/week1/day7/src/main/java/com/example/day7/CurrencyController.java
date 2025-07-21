package com.example.day7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController 
{
    private final CurrencyConverterService currencyConverterService;
    
    @Autowired
    public CurrencyController(CurrencyConverterService currencyConverterService)
    {
        this.currencyConverterService = currencyConverterService;
    }

    @GetMapping("/convert")
    public String convert(@RequestParam double amount)
    {
        return amount +
               " " +
               currencyConverterService.getCurrencyName() +
               " = " +
               currencyConverterService.convert(amount) +
               " toman.";
    }
}
