package com.example.project.Cultures;

//Should be called Dalek not Klingon
public interface Klingon extends Culture {
    int diplomacyModifier = 0;
    int fightiness = 10;

    enum fightingStates {
        ATTACK,
        DEFEND
    }
//No duplicates in the Enum and also no spaces in names
    enum diplomacyStates {
        THREATEN TO EXTERMINATE,
        EXTERMINATE,
        EXTERMINATE
    }
    
    boolean tryToPickAFight(int enemyModifier);
}