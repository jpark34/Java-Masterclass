package com.masterclass;

public class Fish extends Animal{

    private int gils;
    private int eyes;
    private int fins;

    public Fish(int brain, int body, int size, int weight, String name, int gils, int eyes, int fins) {
        super(brain, body, size, weight, name);
        this.gils = gils;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    private void moveMuscles() {

    }

    private void moveBackFin() {

    }

    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
