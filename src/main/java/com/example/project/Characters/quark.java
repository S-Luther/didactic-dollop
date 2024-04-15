package com.example.project.Characters;

import com.example.project.Cultures.Ferengi;

public class quark implements Ferengi {
    diplomacyStates mood;

    public quark(int i){
        mood = diplomacyStates.values()[i];
        System.out.println("Quark is in the mood to " + diplomacyStates.values()[i] + ".");
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
        throw new UnsupportedOperationException("Unimplemented method 'enterNegotiation'");
    }

    @Override
    public Object getMood() {
        return mood;
    }

    @Override
    public String getName() {
        return "Quark";
    }
    
}