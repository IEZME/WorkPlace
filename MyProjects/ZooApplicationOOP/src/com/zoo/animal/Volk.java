package com.zoo.animal;

import com.zoo.Animal;


public class Volk extends Animal {
    public Volk() {
    }

    public Volk(int age, String name, int weight) {
        super(age, name, weight);
    }

    public void say() {
        System.out.println("Awoooooooo");
    }

    public void hunt(int hours) {
        System.out.println("Hunting " + hours + " hours");
    }

    public void hide(int hours) {
        System.out.println("Hiding " + hours + " hours in the trees");
    }

    @Override
    public void calm() {
        System.out.println("No calming");
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
