package com.zoo;

import com.zoo.exception.NegativeValueException;

public abstract class Animal implements FeedAnimal, TakeMedicine {
    private int age;
    private String name;
    private int weight;

    public Animal() {

    }

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getWeight() {
        return weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void say();

    public abstract void calm();

    public void arrive(int year) throws NegativeValueException {
        if (year < 1930) {
            throw new NegativeValueException("-----ANIMAL DONT LIVE SO LONG-----");
        } else {
            System.out.println("Arrive in " + year + " year");
        }
    }

    public void arrive(int year, String country) {
        System.out.println("Arrived " + year + " years ago from " + country);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Animal other = (Animal) obj;
        if (age != other.age) {
            return false;
        }
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        } else if (!name.equals(other.name)) {
            return false;
        }
        if (weight != other.weight) {
            return false;
        }
        return true;
    }

}
