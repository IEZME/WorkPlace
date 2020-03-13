package com.zoo.animal;

import com.zoo.Animal;


public class Lev extends Animal {
    public Lev() {
    }

    public Lev(int age, String name, int weight) {
        super(age, name, weight);
    }

    public void say() {
        System.out.println("Arrrrrrrrrhhhhhhhh");
    }

    public void roar(int times) {
        System.out.println("Roaring " + times + " times");
    }

    public void run(int metres) {
        System.out.println("Running " + metres + " metres in aviary");
    }

    @Override
    public void calm() {
        System.out.println("Calming on the stone");
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
