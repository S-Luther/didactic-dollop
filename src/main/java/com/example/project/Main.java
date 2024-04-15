//Neven Marinkovic
//4/15/2024
//CSCI 152 - Attendance Checker

package com.example.project;

import java.util.Random;

import com.example.project.Characters.BElanna;
import com.example.project.Characters.Daenerys;
import com.example.project.Cultures.Culture;
import com.example.project.Cultures.Klingon;

public class Main {

    public static <T extends Culture,U extends Culture> void interact(T firstPerson, U secondPerson){
        System.out.println(firstPerson.getName() + " is entering into this interaction in the mood of " +firstPerson.getMood());
        System.out.println(secondPerson.getName() + " is entering into this interaction in the mood of " +secondPerson.getMood());
    }

    public static void main(String[] args){
        Random rng = new Random();

        BElanna BElanna = new BElanna(rng.nextInt(3));
        Daenerys Daenerys = new Daenerys(rng.nextInt(3));

        interact(BElanna, Daenerys);


    }
    
}
