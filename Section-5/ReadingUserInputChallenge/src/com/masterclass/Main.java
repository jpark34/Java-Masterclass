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
            number = scanner.nextInt();
            sum += number;
            scanner.nextLine();
            counter++;
        }

        System.out.println("The sum of the 10 entered numbers is: " + sum);
    }
}
