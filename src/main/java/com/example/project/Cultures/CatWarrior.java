package com.example.project.Cultures;

public interface CatWarrior extends Culture {
    int diplomacyModifier = 0;
    int fightiness = 10;

    enum fightingStates {
        ATTACK,
        DEFEND
    }

    enum diplomacyStates {
        THREATEN,
        SUBDUE,
        FIGHT
    }
    
    boolean tryToPickAFight(int enemyModifier);
}
