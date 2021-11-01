package com.masterclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int number = 0;
        int sum = 0;

        while (counter < 10) {
            System.out.println("Please enter a number: ");
            boolean nextInt = scanner.hasNextInt();
            if (nextInt) {
                number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid");
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("The sum of the 10 entered numbers is: " + sum);
    }
}
