package com.example.project.Characters;

import com.example.project.Cultures.Mordor;

public class Gothmog implements Mordor {

    diplomacyStates mood;

    public Gothmog(int i){
        mood = diplomacyStates.values()[i];
        System.out.println("Gothmog is in the mood to " + mood + ".");
    }

    @Override
    public boolean tryDiplomacy(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tryDiplomacy'");
    }

    public String getName()
    {
        return "Gothmog";
    }


    @Override
    public boolean fight(int enemyModifier) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fight'");
    }

    //@Override
    //public boolean tryToPickAFight(int enemyModifier) {
        // TODO Auto-generated method stub
    //    throw new UnsupportedOperationException("Unimplemented method 'tryToPickAFight'");
    //}

    @Override
    public Object getMood() {
        return mood;
    }
    
}
