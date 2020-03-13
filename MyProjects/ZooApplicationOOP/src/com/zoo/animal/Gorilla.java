package com.zoo.animal;

import com.zoo.Animal;
import com.zoo.exception.NoFoodException;

public class Gorilla extends Animal {
    public Gorilla() {
    }

    public Gorilla(int age, String name, int weight) {
        super(age, name, weight);
    }

    public void say() {
        System.out.println("Hou Hou Hou");
    }

    public void climb(int metres) {
        System.out.println("Climbing " + metres + " metres on tree");
    }

    public void play(int minutes) {
        System.out.println("Playing " + minutes + " minutes with bananas");
    }

    @Override
    public void calm() {
        System.out.println("Calming on the tree");
    }

    @Override
    public void eat(int portion, String food) throws NoFoodException {
        if (portion <= 0) {
            throw new NoFoodException("-----NO FOOD-----"); 
        }
        else {
            System.out.println("Eating " + portion + " " + food);
        }
    }

    @Override
    public void medicine(String medicine) {
        System.out.println("Health status -> " + medicine);
    }

}
