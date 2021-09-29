package com.masterclass;

public class Main {

    public static void main(String[] args) {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + minFloatValue);
        System.out.println("Float Max Value = " + maxFloatValue);

        double mindoubleValue = Double.MIN_VALUE;
        double maxdoubleValue = Double.MAX_VALUE;
        System.out.println("double Min Value = " + mindoubleValue);
        System.out.println("double Max Value = " + maxdoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25; //Can also do 5.25f
        double myDoubleValue = 5.25d;

        int intValue = 5 / 3;
        float floatValue = 5f / 3f;
        double doubleValue = 5d / 3d;
        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        double pi = 3.14159d;
    }
}
