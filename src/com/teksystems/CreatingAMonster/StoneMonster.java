package com.teksystems.CreatingAMonster;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return "Attack with stones!";
    }

}
