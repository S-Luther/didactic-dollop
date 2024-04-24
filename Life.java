/******************************************************************************\
 * The goal of this code is to be a blank slate to build a biological simulation
 * on. It is a work in progress, and is more of a proof of concept than a funct-
 * -ional program at the moment. I chose to only simulate generations as from my
 * understanding. That is the only point at which evolution takes place.
 * -Mikhail U. & Toby S.
\******************************************************************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Life {
    public static void spawnAndSimulate(String species, int numGenerations, double mortalityRate,
                                        double reproductionRate, double mutationRate, int maxEnergy, int numSpawn) {
        ArrayList<Creature> creatures = new ArrayList<>();
        Random rand = new Random();

        // Initial population
        for (int i = 0; i < numSpawn; i++) {
            creatures.add(new Creature(species, numGenerations, mortalityRate,
                                       reproductionRate, mutationRate, maxEnergy, i));
        }

        // Simulate each generation
        for (int currentGen = 0; currentGen < numGenerations; currentGen++) {
            int initialSize = creatures.size();
            int newCreatures = (int) (reproductionRate * initialSize);
            for (int i = 0; i < newCreatures; i++) {
                creatures.add(new Creature(species, numGenerations, mortalityRate,
                                           reproductionRate, mutationRate, maxEnergy, creatures.size()));
            }

            int deaths = 0;
            for (int i = creatures.size() - 1; i >= 0; i--) {
                if (rand.nextDouble() < mortalityRate) {
                    creatures.remove(i);
                    deaths++;
                }
            }

            System.out.println("Generation " + currentGen);
            System.out.println("Initial Size: " + initialSize);
            System.out.println("New Creatures: " + newCreatures);
            System.out.println("Deaths: " + deaths);
            System.out.println("Population: " + creatures.size());
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the name of the 'species' you will be simulating:");
        String species = inputScanner.nextLine();
        System.out.println("Enter the number of generations you would like to simulate:");
        int numGenerations = inputScanner.nextInt();
        System.out.println("Enter the generational mortality rate of this species:");
        double mortalityRate = inputScanner.nextDouble();
        System.out.println("Enter a generational reproduction rate:");
        double reproductionRate = inputScanner.nextDouble();
        System.out.println("Enter a generational mutation rate:");
        double mutationRate = inputScanner.nextDouble();
        System.out.println("Enter the number of creatures you would like to start with:");
        int numSpawn = inputScanner.nextInt();
        System.out.println("Enter the maximum energy for this system:");
        int maxEnergy = inputScanner.nextInt();

        spawnAndSimulate(species, numGenerations, mortalityRate, reproductionRate, mutationRate, maxEnergy, numSpawn);
    }
}

class Creature {
    private String species;
    private int numGenerations;
    private double mortalityRate;
    private double reproductionRate;
    private double mutationRate;
    private int maxEnergy;
    private int id;  // Changed from numSpawn

    public Creature(String species, int numGenerations, double mortalityRate,
                    double reproductionRate, double mutationRate,
                    int maxEnergy, int id) {
        this.species = species;
        this.numGenerations = numGenerations;
        this.mortalityRate = mortalityRate;
        this.reproductionRate = reproductionRate;
        this.mutationRate = mutationRate;
        this.maxEnergy = maxEnergy;
        this.id = id;
    }
}
