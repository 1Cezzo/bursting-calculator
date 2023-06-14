package com.burstingcalculator.model;

import java.util.HashMap;
import java.util.Map;

public class BurstLocation {
    private String name;
    private Map<String, Integer> monsterCounts;

    public BurstLocation(String name) {
        this.name = name;
        this.monsterCounts = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addMonster(String monsterName, int burstableCount) {
        monsterCounts.put(monsterName, burstableCount);
    }

    public void removeMonster(String monsterName) {
        monsterCounts.remove(monsterName);
    }

    public int getBurstableMonsterCount(String monsterName) {
        return monsterCounts.getOrDefault(monsterName, 0);
    }

    public Map<String, Integer> getMonsterCounts() {
        return monsterCounts;
    }

    public void setMonsterCounts(Map<String, Integer> monsterCounts) {
        this.monsterCounts = monsterCounts;
    }
}

