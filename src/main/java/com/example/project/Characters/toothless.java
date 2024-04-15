package com.example.project.Characters;

import com.example.project.Cultures.Klingon;

public class toothless implements Klingon {

    public toothless(int i){
        System.out.println("B'Elanna is in the mood to " + diplomacyStates.values()[i] + ".");
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
