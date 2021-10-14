package com.masterclass;

public class Main {

    public static void main(String[] args) {

        int num = 12;
        checkNumber(num);
    }

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        }
    }
}
