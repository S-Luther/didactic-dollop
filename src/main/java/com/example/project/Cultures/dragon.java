package com.example.project.Cultures;

public interface toothless extends Culture {
    int diplomacyModifier = 3;
    int fightingness = 3;

    enum fightingStates {
        ATTACK,
        DEFEND,
        FLEE
    }

    enum negotiateStates{
        GIVE_FISH
    }

    

    
    
}
