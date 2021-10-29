package com.masterclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            int age = 2021 - birthYear;
            scanner.nextLine(); // handle the next line character (enter Key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age > 1 || age < 120) {
                System.out.println("Your name is: " + name + ", and you're " + age);
            } else {
                System.out.println("Invalid Age");
            }
        } else {
            System.out.println("Unable to Parse Birth Year");
        }

        scanner.close();
    }
}
