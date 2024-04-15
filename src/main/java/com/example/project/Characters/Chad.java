package com.example.project.Characters;

import com.example.project.Cultures.TexasRangers;

public class Chad implements TexasRangers {

    diplomacyStates mood;
    private String name;
    private String weapon;

    public Chad(String name, String weapon, String mood) {
        mood = mood;
        System.out.println("Chad is in a " + mood + " mood.");
        this.name = name;
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println("Chad fights with " + weapon);
    }

    public void defend() {
        System.out.println("Chad defends with " + weapon);
    }

    public void move() {
        System.out.println("Chad moves");
    }

    public void speak() {
        System.out.println("Chad speaks");
    }

    public void useSpecialAbility() {
        System.out.println("Chad uses special ability");
    }
}


