package com.zoo.animal;

import com.zoo.Animal;

public class Nosorog extends Animal {
    public Nosorog() {
    }

    public Nosorog(int age, String name, int weight) {
        super(age, name, weight);
    }

    public void say() {
        System.out.println("Uf Uf Uf");
    }

    public void watch(int minutes) {
        System.out.println("Watching " + minutes + " minutes on people");
    }

    public void swim(int metres) {
        System.out.println("Swimming " + metres + " metres in the pool");
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
