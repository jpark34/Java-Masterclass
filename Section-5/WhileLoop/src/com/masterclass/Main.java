package com.masterclass;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 5) {
            System.out.println("Count value = " + count);
            count++;
        }

        System.out.println("***************");

        // Same loop but in a for loop
        for (int i = 1; i != 5; i++) {
            System.out.println("Count value = " + i);
        }

        System.out.println("***************");

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("***************");

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 5);

        System.out.println("***************");

        /* Create a method called isEvenNumber that takes a parameter of type int
            its purpose is to determine if the argument passed to the method is an even number or not
            return true if an even number is found, else return false
         */
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount == 5) {
                System.out.println("There were " + evenCount + " even numbers found");
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
