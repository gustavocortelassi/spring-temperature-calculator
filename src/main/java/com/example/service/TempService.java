package com.example.service;
import org.springframework.stereotype.Service;

@Service
public class TempService {
    
    public double convertToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    public double convertToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
}
