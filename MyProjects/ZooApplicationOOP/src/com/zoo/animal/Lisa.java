package com.zoo.animal;

import com.zoo.Animal;


public class Lisa extends Animal {
    public Lisa() {
    }

    public Lisa(int age, String name, int weight) {
        super(age, name, weight);
    }

    public void say() {
        System.out.println("TinDin TinDin");
    }

    public void sleep(int hours) {
        System.out.println("Sleeping " + hours + " hours");
    }

    public void drink(int litres) {
        System.out.println("Drinking " + litres + " litres of water");
    }

    @Override
    public void calm() {
        System.out.println("Calming on the cave");

    }

    @Override
    public void eat(int portion, String food) {
        System.out.println("Eating " + portion + " " + food);
    }

    @Override
    public void medicine(String medicine) {
        System.out.println("Health status -> " + medicine);
    }

}
