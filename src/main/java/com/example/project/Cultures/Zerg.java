package com.example.project.Cultures;

public interface Zerg extends Culture {
    int diplomacyModifier = 0;
    int swarmDensity = 5;
    int hostility = 10;

    enum fightingStates {
        ATTACK,
        NEST,
        INFILTRATE,
        DEFEND
    }

    enum diplomacyStates {
        THREATEN,
        INVADE,
        FIGHT
    }
    
    boolean tryToPickAFight(int enemyModifier);
}
