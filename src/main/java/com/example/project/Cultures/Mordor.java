package com.example.project.Cultures;

public interface Mordor extends Culture {
    int desireToFight = 10;
    int diplomacy = 1;
    

    enum fightingStates
    {
        SNEAK_ATTACK,
        BRUTAL_CHARGE,
        STRATEGIC_MOVEMENT
    }

    enum weapons
    {
        AX,
        BOW,
        SHARD_OF_METAL,
        MORGUL_BLADE

    }

    enum diplomacyStates
    {
        CONQUER,
        VANQUISH,
        DESTROY,
        DECIEVE,
        MANIPULATE,
        LIE,
        WAR_CRY
    }

    enum moods
    {
        UPSET,
        APPALED,
        ANNOYED,
        FRUSTRATED,
        HAPPY,
        MISCHEVIOUS,
        DECEPTIVE
    }

    

}