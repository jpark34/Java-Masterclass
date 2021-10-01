package com.masterclass;

public class Main {

    public static void main(String[] args) {

        double num1 = 20.00d;
        double num2 = 80.00d;
        double result = num1 + num2; // should be 100
        result *= 100; // should be 10,000
        //System.out.println(result);
        double remainder = result % 40;
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("the boolean equals " + isZero);
        System.out.println("The remainder is " + remainder);
        if (!isZero) {
            System.out.println("There is some remainder.");
        }
    }
}
