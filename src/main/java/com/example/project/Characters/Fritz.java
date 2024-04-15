package com.example.project.Characters;

import com.example.project.Cultures.Bitoo;

public class Fritz implements Bitoo{

    public Fritz(int i){
        System.out.println("Fritz is in the mood to " + diplomacyStates.values()[i] + ".");
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
    public boolean tryToWorkItOut(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tryToWorkItOut'");
    }

}


    
    
