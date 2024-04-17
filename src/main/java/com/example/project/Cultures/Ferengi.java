package com.example.project.Cultures;
public interface Ferengi extends Culture {
    int diplomacyModifier = 7;
    int fightiness = 4;

    enum fightingStates {
        SWINDLE,
        BITE,
        ROB,
        SCRATCH,
        POOR_A_DRINK
    }

    enum diplomacyStates {
        SWINDLE,
        BRIBE,
        COWER,
        NEGOTIATE,
        POOR_A_DRINK
    }
    
    boolean enterNegotiations(int enemyModifier);
}