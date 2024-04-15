package com.example.project.Cultures;

public interface Naboo extends Culture{
    int diplomacyModifier = 10;
    int fightiness = 2;

    enum diplomacyStates{
        DISCUSS_PEACE,
        FIND_COMPROMISE,
        SENATE_HEARING
    }

    enum fightingStates{
        DEFEND,
        DECIEVE
    }

    boolean trytoDiscussPeace(int enemyModifier);
    boolean trytoDefend(int enemeyModifier);
}