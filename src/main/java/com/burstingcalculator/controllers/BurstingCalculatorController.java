package com.burstingcalculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class BurstingCalculatorController {

    @GetMapping("/")
    public String index(Model model) {
        // Add data to the model
        model.addAttribute("message", "Welcome to Bursting Calculator");

        // Return the name of the HTML template for the homepage
        return "index";
    }

    @PostMapping("/calculate")
    public ModelAndView calculate(@RequestParam("gearSetup") String gearSetup,
                                  @RequestParam("location") String location,
                                  @RequestParam("spell") String spell) {
        // Perform calculations based on the input parameters
        // Example: Calculate XP per hour and GP loss per hour
        
        double xpPerHour = calculateXpPerHour(gearSetup, location, spell);
        double gpLossPerHour = calculateGpLossPerHour(gearSetup, location, spell);

        // Create a ModelAndView object to pass data to the result view
        ModelAndView modelAndView = new ModelAndView("result");
        modelAndView.addObject("xpPerHour", xpPerHour);
        modelAndView.addObject("gpLossPerHour", gpLossPerHour);
        
        return modelAndView;
    }
    
    // Helper methods to calculate XP per hour and GP loss per hour
    private double calculateXpPerHour(String gearSetup, String location, String spell) {
        // Perform calculations based on gear setup, location, and spell
        return 0.0; // Replace with actual calculation
    }
    
    private double calculateGpLossPerHour(String gearSetup, String location, String spell) {
        // Perform calculations based on gear setup, location, and spell
        return 0.0; // Replace with actual calculation
    }
}
