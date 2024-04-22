package com.example.project.Characters;

import com.example.project.Cultures.Valyrian;

public class Daenerys implements Valyrian {

    diplomacyStates mood;

    public Daenerys(int i){
        mood = diplomacyStates.values()[i];
        System.out.println("Daenerys is in the mood to " + mood + ".");
    }

    @Override
    public boolean tryDiplomacy(int enemyModifier) {
        if (diplomacyModifier > enemyModifier) 
            return true;
        else
            return false;
        };
    

    @Override
    public boolean fight(int enemyModifier) {
        if (fightiness > enemyModifier) 
            return true;
        else
            return false;
    }

    @Override
    public boolean tryToPickAFight(int enemyModifier) {
        return fight(enemyModifier);
    }

    @Override
    public diplomacyStates getMood() {
        return mood;
    }

    @Override
    public String getName() {
        return "Daenerys Targaryen";
    }
    
}