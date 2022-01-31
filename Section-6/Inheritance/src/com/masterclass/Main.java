package com.masterclass;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(1, 1, 1, 5, "Animal");

        Dog dog = new Dog(8, 10, "yorkie", 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.run();
    }
}
