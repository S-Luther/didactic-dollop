

package com.example.project.Cultures;

public interface Mordor extends Culture {
    int desireToFight = 10;
    int diplomacy = 1;

    enum fightingStates
    {
        ATTACK,
        SNEAK_ATTACK
    }

    enum diplomacyStates
    {
        CONQUER,
        VANQUISH,
        DESTROY
    }

    

}