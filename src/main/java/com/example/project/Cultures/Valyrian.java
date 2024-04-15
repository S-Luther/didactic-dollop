package com.example.project.Cultures;

public interface Valyrian extends Culture {
    int diplomacyModifier = 0;
    int fightiness = 10;

    enum fightingStates {
        RAIN_FIRE,
        DRAGONS_ATTACK,
        FLY_AWAY
    }

    enum diplomacyStates {
        MAKE_PEACE,
        FIGHT,
        THREATEN
    }
    
    boolean tryToPickAFight(int enemyModifier);
}
