package com.example.project.Cultures;


//Culture not Cultures
public interface Belters extends Culture{
    int diplomacyModifier = 4;
    int fightiness = 9;

    enum fightingStates{
        DEPLOY_SHIPS,
        SABOTAGE_OUTPOSTS,
        TERRORIZE,
        RIOT
    }
    enum diplomacyStates{
        NEGOTIATE,
        THREATEN,
        DEMAND,
        EXPRESS_OUTRAGE
    }

}