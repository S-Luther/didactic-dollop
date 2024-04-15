// Friendly Engineering Culture from starwars //
package com.example.project.Cultures;
// Mon Calamari are peaceful, and like making alliances //
public interface MonCalamari extends Culture {
    int diplomacyModifier = 10;
    int aggressionModifier = 1;

    enum fightingStates {
        DEFEND,
        ATTACK
    }
    enum negotiateStates{
        Federate
    }

    enum diplomacyStates {
        Peaceful,
        Wary
    }
    boolean peacefulUnification(int enemyModifier);
}
