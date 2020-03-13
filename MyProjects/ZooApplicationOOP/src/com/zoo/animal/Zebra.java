package com.zoo.animal;

import com.zoo.Animal;


public class Zebra extends Animal {
    public Zebra() {
    }

    public Zebra(int age, String name, int weight) {
        super(age, name, weight);
    }

    public void say() {
        System.out.println("Igo Igo Igo");
    }

    public void dance(int times) {
        System.out.println("Dancing " + times + " hours");
    }

    public void graze(int hours) {
        System.out.println("Grazing " + hours + " hours in the grass");
    }

    @Override
    public void calm() {
        System.out.println("Calming on the grass");
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
