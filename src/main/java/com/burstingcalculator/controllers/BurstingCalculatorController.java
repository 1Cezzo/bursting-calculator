package com.burstingcalculator.controllers;

import com.burstingcalculator.model.BurstLocation;
import com.burstingcalculator.model.Item;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
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
    private List<BurstLocation> burstLocations;
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
        ObjectMapper objectMapperHelmet = new ObjectMapper();
        List<Item> listOfHelmets = new ArrayList<>();
        
        // Obtain the path to the icons/helmets folder
        String helmetsFolderPath = "src/main/resources/static/images/icons/helmets";

        // Create a File object representing the helmets folder
        File helmetsFolder = new File(helmetsFolderPath);

        // Check if the folder exists and is a directory
        if (helmetsFolder.exists() && helmetsFolder.isDirectory()) {
            // Get the list of files in the helmets folder
            File[] helmetFiles = helmetsFolder.listFiles();

            if (helmetFiles != null) {
                for (File helmetFile : helmetFiles) {
                    // Extract the helmet name from the file name and replace underscores with spaces
                    String helmetName = helmetFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String helmetImageUrl = "/images/icons/helmets/" + helmetFile.getName();

                    // Create a new Item object and add it to the list
                    listOfHelmets.add(new Item(helmetName, helmetImageUrl));
                }
            }
        }

        try {
            String json = objectMapperHelmet.writeValueAsString(listOfHelmets);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/amulets")
    public ResponseEntity<String> getAmulets() {
        ObjectMapper objectMapperAmulet = new ObjectMapper();
        List<Item> listOfAmulets = new ArrayList<>();
        
        // Obtain the path to the icons/amulets folder
        String amuletsFolderPath = "src/main/resources/static/images/icons/amulets";

        // Create a File object representing the amulets folder
        File amuletsFolder = new File(amuletsFolderPath);

        // Check if the folder exists and is a directory
        if (amuletsFolder.exists() && amuletsFolder.isDirectory()) {
            // Get the list of files in the amulets folder
            File[] amuletFiles = amuletsFolder.listFiles();

            if (amuletFiles != null) {
                for (File amuletFile : amuletFiles) {
                    // Extract the amulet name from the file name and replace underscores with spaces
                    String amuletName = amuletFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String amuletImageUrl = "/images/icons/amulets/" + amuletFile.getName();

                    // Create a new Item object and add it to the list
                    listOfAmulets.add(new Item(amuletName, amuletImageUrl));
                }
            }
        }
        Collections.sort(listOfAmulets, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));
        
        try {
            String json = objectMapperAmulet.writeValueAsString(listOfAmulets);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/capes")
    public ResponseEntity<String> getCapes() {
        ObjectMapper objectMapperCape = new ObjectMapper();
        List<Item> listOfCapes = new ArrayList<>();
        
        // Obtain the path to the icons/capes folder
        String capesFolderPath = "src/main/resources/static/images/icons/capes";

        // Create a File object representing the capes folder
        File capesFolder = new File(capesFolderPath);

        // Check if the folder exists and is a directory
        if (capesFolder.exists() && capesFolder.isDirectory()) {
            // Get the list of files in the capes folder
            File[] capeFiles = capesFolder.listFiles();

            if (capeFiles != null) {
                for (File capeFile : capeFiles) {
                    // Extract the cape name from the file name and replace underscores with spaces
                    String capeName = capeFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String capeImageUrl = "/images/icons/capes/" + capeFile.getName();

                    // Create a new Item object and add it to the list
                    listOfCapes.add(new Item(capeName, capeImageUrl));
                }
            }
        }
        Collections.sort(listOfCapes, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperCape.writeValueAsString(listOfCapes);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/weapons")
    public ResponseEntity<String> getWeapons() {
        ObjectMapper objectMapperWeapon = new ObjectMapper();
        List<Item> listOfWeapons = new ArrayList<>();
       
        // Obtain the path to the icons/weapons folder
        String weaponsFolderPath = "src/main/resources/static/images/icons/weapons";

        // Create a File object representing the weapons folder
        File weaponsFolder = new File(weaponsFolderPath);

        // Check if the folder exists and is a directory
        if (weaponsFolder.exists() && weaponsFolder.isDirectory()) {
            // Get the list of files in the weapons folder
            File[] weaponFiles = weaponsFolder.listFiles();

            if (weaponFiles != null) {
                for (File weaponFile : weaponFiles) {
                    // Extract the weapon name from the file name and replace underscores with spaces
                    String weaponName = weaponFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String weaponImageUrl = "/images/icons/weapons/" + weaponFile.getName();

                    // Create a new Item object and add it to the list
                    listOfWeapons.add(new Item(weaponName, weaponImageUrl));
                }
            }
        }
        Collections.sort(listOfWeapons, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperWeapon.writeValueAsString(listOfWeapons);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/torsos")
    public ResponseEntity<String> getTorsos() {
        ObjectMapper objectMapperTorso = new ObjectMapper();
        List<Item> listOfWeapons = new ArrayList<>();
        
        // Obtain the path to the icons/torsos folder
        String torsosFolderPath = "src/main/resources/static/images/icons/torsos";

        // Create a File object representing the torsos folder
        File torsosFolder = new File(torsosFolderPath);

        // Check if the folder exists and is a directory
        if (torsosFolder.exists() && torsosFolder.isDirectory()) {
            // Get the list of files in the torsos folder
            File[] torsoFiles = torsosFolder.listFiles();

            if (torsoFiles != null) {
                for (File torsoFile : torsoFiles) {
                    // Extract the torso name from the file name and replace underscores with spaces
                    String torsoName = torsoFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String torsoImageUrl = "/images/icons/torsos/" + torsoFile.getName();

                    // Create a new Item object and add it to the list
                    listOfWeapons.add(new Item(torsoName, torsoImageUrl));
                }
            }
        }
        Collections.sort(listOfWeapons, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperTorso.writeValueAsString(listOfWeapons);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    
    @GetMapping("/api/shields")
    public ResponseEntity<String> getShields() {
        ObjectMapper objectMapperShield = new ObjectMapper();
        List<Item> listOfShields = new ArrayList<>();
        
        // Obtain the path to the icons/shields folder
        String shieldsFolderPath = "src/main/resources/static/images/icons/shields";

        // Create a File object representing the shields folder
        File shieldsFolder = new File(shieldsFolderPath);

        // Check if the folder exists and is a directory
        if (shieldsFolder.exists() && shieldsFolder.isDirectory()) {
            // Get the list of files in the shields folder
            File[] shieldFiles = shieldsFolder.listFiles();

            if (shieldFiles != null) {
                for (File shieldFile : shieldFiles) {
                    // Extract the shield name from the file name and replace underscores with spaces
                    String shieldName = shieldFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String shieldImageUrl = "/images/icons/shields/" + shieldFile.getName();

                    // Create a new Item object and add it to the list
                    listOfShields.add(new Item(shieldName, shieldImageUrl));
                }
            }
        }
        Collections.sort(listOfShields, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperShield.writeValueAsString(listOfShields);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/legs")
    public ResponseEntity<String> getLegs() {
        ObjectMapper objectMapperLeg = new ObjectMapper();
        List<Item> listOfLegs = new ArrayList<>();
        
        // Obtain the path to the icons/legs folder
        String legsFolderPath = "src/main/resources/static/images/icons/legs";

        // Create a File object representing the legs folder
        File legsFolder = new File(legsFolderPath);

        // Check if the folder exists and is a directory
        if (legsFolder.exists() && legsFolder.isDirectory()) {
            // Get the list of files in the legs folder
            File[] legFiles = legsFolder.listFiles();

            if (legFiles != null) {
                for (File legFile : legFiles) {
                    // Extract the leg name from the file name and replace underscores with spaces
                    String legName = legFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String legImageUrl = "/images/icons/legs/" + legFile.getName();

                    // Create a new Item object and add it to the list
                    listOfLegs.add(new Item(legName, legImageUrl));
                }
            }
        }
        Collections.sort(listOfLegs, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperLeg.writeValueAsString(listOfLegs);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/gloves")
    public ResponseEntity<String> getGloves() {
        ObjectMapper objectMapperGlove = new ObjectMapper();
        List<Item> listOfGloves = new ArrayList<>();
        
        // Obtain the path to the icons/gloves folder
        String glovesFolderPath = "src/main/resources/static/images/icons/gloves";

        // Create a File object representing the gloves folder
        File glovesFolder = new File(glovesFolderPath);

        // Check if the folder exists and is a directory
        if (glovesFolder.exists() && glovesFolder.isDirectory()) {
            // Get the list of files in the gloves folder
            File[] gloveFiles = glovesFolder.listFiles();

            if (gloveFiles != null) {
                for (File gloveFile : gloveFiles) {
                    // Extract the glove name from the file name and replace underscores with spaces
                    String gloveName = gloveFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String gloveImageUrl = "/images/icons/gloves/" + gloveFile.getName();

                    // Create a new Item object and add it to the list
                    listOfGloves.add(new Item(gloveName, gloveImageUrl));
                }
            }
        }
        Collections.sort(listOfGloves, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperGlove.writeValueAsString(listOfGloves);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/api/boots")
    public ResponseEntity<String> getBoots() {
        ObjectMapper objectMapperBoot = new ObjectMapper();
        List<Item> listOfBoots = new ArrayList<>();

        // Obtain the path to the icons/boots folder
        String bootsFolderPath = "src/main/resources/static/images/icons/boots";

        // Create a File object representing the boots folder
        File bootsFolder = new File(bootsFolderPath);

        // Check if the folder exists and is a directory
        if (bootsFolder.exists() && bootsFolder.isDirectory()) {
            // Get the list of files in the boots folder
            File[] bootFiles = bootsFolder.listFiles();

            if (bootFiles != null) {
                for (File bootFile : bootFiles) {
                    // Extract the boot name from the file name and replace underscores with spaces
                    String bootName = bootFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String imageUrl = "/images/icons/boots/" + bootFile.getName();

                    // Create the item object and add it to the list
                    listOfBoots.add(new Item(bootName, imageUrl));
                }
            }
        }
        Collections.sort(listOfBoots, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperBoot.writeValueAsString(listOfBoots);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/api/rings")
    public ResponseEntity<String> getRings() {
        ObjectMapper objectMapperRing = new ObjectMapper();
        List<Item> listOfRings = new ArrayList<>();

        // Obtain the path to the icons/rings folder
        String ringsFolderPath = "src/main/resources/static/images/icons/rings";

        // Create a File object representing the rings folder
        File ringsFolder = new File(ringsFolderPath);

        // Check if the folder exists and is a directory
        if (ringsFolder.exists() && ringsFolder.isDirectory()) {
            // Get the list of files in the rings folder
            File[] ringFiles = ringsFolder.listFiles();

            if (ringFiles != null) {
                for (File ringFile : ringFiles) {
                    // Extract the ring name from the file name and replace underscores with spaces
                    String ringName = ringFile.getName().replace(".png", "").replace("_", " ");

                    // Construct the image URL using the base URL and relative path
                    String imageUrl = "/images/icons/rings/" + ringFile.getName();

                    // Create the item object and add it to the list
                    listOfRings.add(new Item(ringName, imageUrl));
                }
            }
        }
        Collections.sort(listOfRings, (item1, item2) -> item1.getName().compareToIgnoreCase(item2.getName()));

        try {
            String json = objectMapperRing.writeValueAsString(listOfRings);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    public BurstingCalculatorController() {
        burstLocations = new ArrayList<>();

        // Initialize BurstLocations and add Monsters
        BurstLocation smokeDungeon = new BurstLocation("Smoke Dungeon");
        smokeDungeon.addMonster("Dust devils", 5);
        smokeDungeon.addMonster("Smoke devils", 9);
        burstLocations.add(smokeDungeon);

        BurstLocation mmTunnels = new BurstLocation("MM Tunnels");
        mmTunnels.addMonster("Maniacal Monkeys", 9);
        mmTunnels.addMonster("Skeletons", 9);
        mmTunnels.addMonster("Zombie Monkeys", 9);
        burstLocations.add(mmTunnels);

        BurstLocation catacombs = new BurstLocation("Catacombs of Kourend");
        catacombs.addMonster("Ankou", 9);
        catacombs.addMonster("Dust Devils", 9);
        catacombs.addMonster("Greater Nechryaels", 9);
        catacombs.addMonster("Nechryaels", 9);
        burstLocations.add(catacombs);
    }

    @GetMapping("/api/burst-locations")
    public ResponseEntity<String> getBurstLocations() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(burstLocations);
            return ResponseEntity.ok(json);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
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
