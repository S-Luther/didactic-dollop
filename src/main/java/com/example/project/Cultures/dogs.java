package com.example.project.Cultures;

//Should be dogs, not Klingon
public interface dogs extends Culture {
    int diplomacyModifier = 9;
    int fightiness = 1;

    enum fightingStates {
        BARK,
        BITE
    

    }

    enum diplomacyStates {
        PUPPYEYES,
        ROLLOVER,
        BRINGSTICK,
        SNIFF



    }
    
    boolean tryToPickAFight(int enemyModifier);
}
