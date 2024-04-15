package com.example.project.Cultures;

public interface FishFolk extends Culture {
    int diplomacyModifier = 10;
    int aggressionModifier = 1;

    enum diplomacyStates {
        PEACEFUL,
        AGGRESSIVE,
        FRIGHTENED
    }

    enum fightingStates { 
        ATTACK,
        DEFEND,
        FLEA
    }
    
    public boolean attemptsNegotiation(int enemyModifier);

}