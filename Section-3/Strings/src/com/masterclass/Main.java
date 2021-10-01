package com.masterclass;

public class Main {

    public static void main(String[] args) {
	    // 8 Primitive Data Types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is added to myString.";
        System.out.println(("myString is now equal to " + myString));
        myString = myString + " \u00A9 2019";
        System.out.println("myString now equals " + myString);

        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println("numString equals " + numString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println("lastString now equals " + lastString);
    }
}
