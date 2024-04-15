package com.example.project.Characters;

import com.example.project.Cultures.MonCalamari;

public class Ackbar implements MonCalamari {

    public Ackbar(int i){
        System.out.println("Ackbar is in the mood to " + diplomacyStates.values()[i] + ".");
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
    public boolean peacefulUnification (int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'enterNegotiation'");
    }
    
}