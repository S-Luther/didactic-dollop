package com.example.project.Cultures;

public interface TexasRangers extends Culture {
    int diplomacyModifier = 5;
    int fightiness = 7;

    enum negotiateStates {
        PERSUADE,
        THREATEN,
        RIZZ
    }

    enum diplomacyStates {
        CHILL,
        BEEF,
        RIZZ
    }
    
    boolean tryToRizz(int enemyModifier);

    boolean tryToNegotiate(int enemyModifier);

    //git change



    
}