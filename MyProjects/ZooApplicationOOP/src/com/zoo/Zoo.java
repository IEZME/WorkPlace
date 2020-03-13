package com.zoo;

import java.util.HashMap;
import java.util.HashSet;

import com.zoo.animal.Gorilla;
import com.zoo.animal.Kenguru;
import com.zoo.animal.Lev;
import com.zoo.animal.Lisa;
import com.zoo.animal.Nosorog;
import com.zoo.animal.Volk;
import com.zoo.animal.Zebra;
import com.zoo.exception.FullCageException;
import com.zoo.exception.NegativeValueException;
import com.zoo.exception.NoFoodException;
import com.zoo.exception.NoPlaceZooException;
import com.zoo.exception.SimilarAnimalsException;

public class Zoo {
    protected static Animal fullCage(Animal animal, HashSet<Animal> cage)
            throws FullCageException, SimilarAnimalsException {
        if (cage.size() > 4) {
            throw new FullCageException("Cage is Full");
        } else {
            cage.add(animal);
        }

        if (!cage.add(animal)) {
            throw new SimilarAnimalsException("Similar animals");
        }

        return animal;

    }

    protected static Boolean addRightCage(Animal animals, HashMap<String, HashSet<Animal>> zoo, String name)
            throws NoPlaceZooException {
        if (!zoo.containsKey(name)) {
            throw new NoPlaceZooException("No that Cage");
        } else {
            for (var a : zoo.entrySet()) {
                if (a.getKey().equals(name)) {
                    a.getValue().add(animals);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws NegativeValueException, NoFoodException, FullCageException,
            SimilarAnimalsException, NoPlaceZooException {

        Gorilla gorilla1 = new Gorilla(23, "Jimmy the Gorilla", 120);
        System.out.println("Name: " + gorilla1.getName());
        System.out.println("Age = " + gorilla1.getAge());
        System.out.println("Weight = " + gorilla1.getWeight());
        gorilla1.say();
        gorilla1.climb(10);
        gorilla1.play(2);
        gorilla1.calm();
        try {
            gorilla1.eat(0, "bananas");
        } catch (NoFoodException exception) {
            System.out.println(exception.getMessage());
        }
        gorilla1.medicine("Excellent");
        try {
            gorilla1.arrive(1920);
        } catch (NegativeValueException exception) {
            System.out.println(exception.getMessage());
        }
        gorilla1.arrive(10, "Africa");

        Kenguru kenguru1 = new Kenguru(41, "Chuck the Kenguru", 96);
        System.out.println("Name: " + kenguru1.getName());
        System.out.println("Age = " + kenguru1.getAge());
        System.out.println("Weight = " + kenguru1.getWeight());
        kenguru1.say();
        kenguru1.jump(2);
        kenguru1.kick(4);
        kenguru1.calm();
        kenguru1.eat(5, "apples");
        kenguru1.medicine("Need stomach pills");

        Kenguru kenguru2 = new Kenguru(41, "Chuck the Kenguru", 96);
        System.out.println("Name: " + kenguru2.getName());
        System.out.println("Age = " + kenguru2.getAge());
        System.out.println("Weight = " + kenguru2.getWeight());
        kenguru2.say();
        kenguru2.jump(2);
        kenguru2.kick(4);
        kenguru2.calm();
        kenguru2.eat(5, "apples");
        kenguru2.medicine("Need stomach pills");

        Lev lev1 = new Lev(8, "Luijo the Lev", 13);
        System.out.println("Name: " + lev1.getName());
        System.out.println("Age = " + lev1.getAge());
        System.out.println("Weight = " + lev1.getWeight());
        lev1.say();
        lev1.roar(2);
        lev1.run(8);
        lev1.calm();
        lev1.eat(3, "meat slices");
        lev1.medicine("Good");

        Lisa lisa1 = new Lisa(12, "Valentine the Lisa", 8);
        System.out.println("Name: " + lisa1.getName());
        System.out.println("Age = " + lisa1.getAge());
        System.out.println("Weight = " + lisa1.getWeight());
        lisa1.say();
        lisa1.sleep(13);
        lisa1.drink(2);
        lisa1.calm();
        lisa1.eat(5, "chiken balls");
        lisa1.medicine("Need vaccination");

        Nosorog nosorog1 = new Nosorog(29, "John the Nosorog", 200);
        System.out.println("Name: " + nosorog1.getName());
        System.out.println("Age = " + nosorog1.getAge());
        System.out.println("Weight = " + nosorog1.getWeight());
        nosorog1.say();
        nosorog1.watch(32);
        nosorog1.swim(3);
        nosorog1.calm();
        nosorog1.eat(8, "pears");
        nosorog1.medicine("Good");

        Volk volk1 = new Volk(1, "James the Volk", 5);
        System.out.println("Name: " + volk1.getName());
        System.out.println("Age = " + volk1.getAge());
        System.out.println("Weight = " + volk1.getWeight());
        volk1.say();
        volk1.hunt(6);
        volk1.hide(12);
        volk1.calm();
        volk1.eat(1, "meat slice");
        volk1.medicine("Paw ligation");

        Zebra zebra1 = new Zebra(17, "Marvin the Zebra", 100);
        System.out.println("Name: " + zebra1.getName());
        System.out.println("Age = " + zebra1.getAge());
        System.out.println("Weight = " + zebra1.getWeight());
        zebra1.say();
        zebra1.dance(2);
        zebra1.graze(9);
        zebra1.calm();
        zebra1.eat(6, "mango");
        zebra1.medicine("Excellent");

        HashSet<Animal> cage = new HashSet<>();
        try {
            fullCage(gorilla1, cage);
            fullCage(kenguru1, cage);
            fullCage(kenguru2, cage);
            fullCage(lev1, cage);
            fullCage(lisa1, cage);
            fullCage(nosorog1, cage);
            fullCage(volk1, cage);
            fullCage(zebra1, cage);
        } catch (FullCageException exception) {
            System.out.println(exception.getMessage());
        } catch (SimilarAnimalsException exception1) {
            System.out.println(exception1.getMessage());
        }
        for (var animal : cage) {
            System.out.println(animal.getName());
        }

        HashMap<String, HashSet<Animal>> zooMain = new HashMap<>();

        HashSet<Animal> cage1 = new HashSet<>();
        HashSet<Animal> cage2 = new HashSet<>();
        HashSet<Animal> cage3 = new HashSet<>();

        zooMain.put("Big 1", cage1);
        zooMain.put("Small 2", cage2);
        zooMain.put("Normal 3", cage3);
        try {
            addRightCage(gorilla1, zooMain, "Big 1");
            addRightCage(kenguru1, zooMain, "Small 2");
            addRightCage(lev1, zooMain, "Normal 3");
            addRightCage(volk1, zooMain, "Normal 31");
        } catch (NoPlaceZooException exception) {
            System.out.println(exception.getMessage());
        }

        for (var a : zooMain.entrySet()) {
            System.out.print(a.getKey() + " ->");
            for (Animal animal : a.getValue()) {
                System.out.print(animal.getName());
            }
            System.out.println();

        }

    }
}
