package com.example.project.Characters;

import com.example.project.Cultures.Mordor;

public class Gothmog implements Mordor {

    moods mood;

    public Gothmog(int i){
        mood = moods.values()[i];
        //System.out.println("Gothmog is in the mood to " + mood + ".");
    }

    @Override
    public boolean tryDiplomacy(int enemyModifier) {
        System.out.println("Gothmog wants to " + diplomacyStates.values()[enemyModifier]);
        return false;
    }

    public String getName()
    {
        return "Gothmog";
    }


    @Override
    public boolean fight(int i) {
        System.out.println("Gothmog is always in the mood to fight!");
        return true;
        
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
