package com.example.project.Characters;

import com.example.project.Cultures.FishFolk;

public class MantaRay implements FishFolk {
    Random rand = new Random();
    int diplomacyModifier = 10;
    int aggressionModifier = 3;
    public boolean attemptNegotiation(){
        if (rand.nextInt(20)<diplomacyModifier){
            return true;
        }
        return false;
    }
        
    public boolean tryToPickAFight() {
        if (rand.nextInt(20) <= aggressionModifier) {
            return true;
        }
        return false;
    }

    public boolean flee() {
        if (rand.nextInt(20) > aggressionModifier+ diplomacyModifier) {
            return true;
        }
        return false;
    }
    }
}