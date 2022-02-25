package com.teksystems.CreatingAMonster;

public class FireMonster extends Monster {

    public FireMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}

