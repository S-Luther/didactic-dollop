package com.example.project.Cultures;

public interface meow extends Culture {
    int diplomacyModifier = 0;
    int fightiness = 5;

    enum fightingStates {
        SCRATCH,
        HISS
    }
    enum dipomacyStates {
        MEOW,
        PURR
    }
    
}