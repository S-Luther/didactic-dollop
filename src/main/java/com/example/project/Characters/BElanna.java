package com.example.project.Characters;

import com.example.project.Cultures.Klingon;

public class BElanna implements Klingon {

    diplomacyStates mood;

    public BElanna(int i){
        mood = diplomacyStates.values()[i];
        System.out.println("B'Elanna is in the mood to " + mood + ".");
    }

    @Override
    public boolean tryDiplomacy(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tryDiplomacy'");
    }

    @Override
    public boolean fight(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fight'");
    }

    @Override
    public boolean tryToPickAFight(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tryToPickAFight'");
    }

    @Override
    public diplomacyStates getMood() {
        return mood;
    }

    @Override
    public String getName() {
        return "B'Elanna";
    }
    
}
