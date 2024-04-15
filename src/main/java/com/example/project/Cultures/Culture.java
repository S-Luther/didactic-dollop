package com.example.project.Cultures;

public interface Culture {

    boolean tryDiplomacy(int enemyModifier);
    boolean fight(int enemyModifier);

    Object getMood();
    String getName();
    
}
