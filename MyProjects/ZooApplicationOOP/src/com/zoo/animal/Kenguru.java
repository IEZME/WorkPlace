package com.zoo.animal;

import com.zoo.Animal;

public class Kenguru extends Animal {
    public Kenguru() {
    }

    public Kenguru(int age, String name, int weight) {
        super(age, name, weight);
    }

    public void say() {
        System.out.println("Chiiik");
    }

    public void jump(int metres) {
        System.out.println("Jumping " + metres + " metres long");
    }

    public void kick(int times) {
        System.out.println("Kicking " + times + " times in a row");
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
