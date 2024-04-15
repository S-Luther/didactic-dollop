package com.example.project.Cultures;

public interface Gary_Indiana extends Culture{
    int diplomacyModifier = 10;
    int diplomacy = 1;

    enum negotiateStates{
        ATTACK,
        ABANDON,
        NOTHING

    }

    enum diplomacyStates{
        ABANDON,
        BRIBE,
        LOSE_STEEL_MILL
    }

    boolean enterNegotiations(int enemeyModifier);
}