package com.example.project.Cultures;

public interface Bitoo extends Culture {

    int diplomacyModifier = 10;
    int fightiness = 2;

    enum fightingStates {
        ASK_NICELY_FOR_CONTROL_OF_PLANET,
        JUST_QUIETLY_MOVE_IN_TO_PLANET,
        GIVEUP
    }

    enum diplomacyStates {
        MAKE_PEACE,
        IGNORE_THREAT,
        FIGHT_A_LITTLE,

    }
    
    boolean tryToWorkItOut(int enemyModifier);

    boolean sayTurnThatFrownUpsideDown(int enemeyModifier);



}