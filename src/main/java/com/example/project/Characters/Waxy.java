package com.example.project.Characters;

import com.example.project.Cultures.Liverwort;

public class Waxy implements Liverwort {
    diplomacyStates mood;

    public Waxy(int i){
        mood = diplomacyStates.values()[i];
        System.out.println("Waxy is in the mood to " + diplomacyStates.values()[i] + ".");
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
    public boolean kissUp(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kissUp'");
    }
    @Override
    public boolean attemptNegotiation(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attemptNegotiation'");
    }

    @Override
    public boolean hireAssassin(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buyAssassin'");
    }

    @Override
    public diplomacyStates getMood(){
        return mood;
    }
    
    @Override
    public String getName(){
        return "Waxy Cuticle";
    }
}
