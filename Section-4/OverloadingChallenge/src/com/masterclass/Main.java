package com.masterclass;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0) {
            System.out.println("Invalid feet parameter");
            return -1;
        }
        if ( (inches < 0) || (inches > 12) ) {
            System.out.println("Invalid inches parameter");
            return -1;
        }

        double cm = ((feet * 12) + inches) * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm");
        return cm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainderInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainderInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
}
