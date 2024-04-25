package com.example.project.Species;

import java.util.ArrayList;

public class BitooSpecies {
    String name;
    int age;
    ArrayList<String> friends = new ArrayList<>();

    public BitooSpecies(String name, int age, ArrayList<String> friends){
        this.name = name;
        this.age = age;
        this.friends = friends;
    }
}
