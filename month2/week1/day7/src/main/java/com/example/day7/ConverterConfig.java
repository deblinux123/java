package com.example.day7;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class ConverterConfig 
{
      @Bean
      public CurrencyConverterService currencyConverterService()
      {
        return new DollarToTomanService();
      }

}
