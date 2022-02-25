package com.teksystems.CreatingAMonster;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return "Attack with water!";
    }
}
