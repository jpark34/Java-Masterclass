package com.masterclass;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if ( (i % 3 == 0) && (i % 5 == 0) ) {
                sum += i;
                System.out.println(i + " is divisible by both 3 and 5");
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }

        System.out.println("The sum of the first 5 numbers between 1 and 1000 that are both divisible by 3 and 5 is: " + sum);
    }
}
