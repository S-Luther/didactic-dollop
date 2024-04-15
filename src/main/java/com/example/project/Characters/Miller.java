package com.example.project.Characters;

import com.example.project.Cultures.Belters;

public class Miller implements Belters {

    public Miller(int i){
        mood = diplomacyStates.values()[i];
        System.out.println("Miller is in the mood to " + mood + ".");
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
    
}
