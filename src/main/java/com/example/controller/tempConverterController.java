package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TempService;

@RestController
public class tempConverterController {
    
    @Autowired
    private TempService tempService;

    @GetMapping("/convertToCelsius")
    public double convertToCelsius(@RequestParam double fahrenheit) {
        return tempService.convertToCelsius(fahrenheit);
    }

    @GetMapping("/convertToFahrenheit")
    public double convertToFahrenheit(@RequestParam double celsius) {
        return tempService.convertToFahrenheit(celsius);
    }
}
