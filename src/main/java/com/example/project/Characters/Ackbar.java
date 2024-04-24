package com.example.project.Characters;

import com.example.project.Cultures.MonCalamari;

public class Ackbar implements MonCalamari {

    public Ackbar(int i){
        System.out.println("Ackbar is in the mood to " + diplomacyStates.values()[i] + ".");
    }

    @Override
    public boolean tryDiplomacy(int enemyModifier) {
        // TODO Auto-generated method stub //
        // Should mostly try diplomacy, even if hes good at fighting //
        throw new UnsupportedOperationException("Unimplemented method 'tryDiplomacy'");
    }

    @Override
    public boolean fight(int enemyModifier) {
        // TODO Auto-generated method stub //
        // He should echo its a trap somewhere //
        throw new UnsupportedOperationException("Unimplemented method 'fight'");
    }

    @Override
    public boolean peacefulUnification (int enemyModifier) {
        // TODO Auto-generated method stub //
        // The Ackbar version of conquer, welcoming other planets to the fold //
        throw new UnsupportedOperationException("Unimplemented method 'enterNegotiation'");
    }
    
}
