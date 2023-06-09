package com.burstingcalculator.controllers;

import com.burstingcalculator.model.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/level-goal")
    public String levelGoalCalculator() {
        return "level-goal";
    }

    @GetMapping("/xp-hour")
    public String xpHourCalculator() {
        return "xp-hour";
    }

    @GetMapping("/api/helmets")
    public ResponseEntity<String> getHelmets() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Item> listOfHelmets = new ArrayList<>();
        // Populate listOfHelmets with helmet items
        listOfHelmets.add(new Item("Ancestral hat", "/images/icons/Ancestral_hat.png"));
        listOfHelmets.add(new Item("Ahrim's hood", "/images/icons/Ahrim's_hood.png"));
        listOfHelmets.add(new Item("Dagon'hai hat", "/images/icons/Dagon'hai_hat.png"));
        // Add more helmet items as needed

        try {
            String json = objectMapper.writeValueAsString(listOfHelmets);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/amulets")
    public List<Item> getAmulets() {
        List<Item> listOfAmulets = new ArrayList<>();
        // Populate listOfAmulets with amulet items
        listOfAmulets.add(new Item("Amulet 1", "/images/amulet1.png"));
        listOfAmulets.add(new Item("Amulet 2", "/images/amulet2.png"));
        // Add more amulet items as needed
        
        return listOfAmulets;
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
