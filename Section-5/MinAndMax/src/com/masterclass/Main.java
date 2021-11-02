package com.masterclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int min = 0;
        int max = 0;
        boolean flag = true;

        while (true) {
            System.out.println("Enter a number: ");
            boolean nextInt = scanner.hasNextInt();

            if (nextInt) {
                number = scanner.nextInt();

                if (flag) {
                    flag = false;
                    min = number;
                    max = number;
                }

                if (number > max) {
                    max = number;
                }

                if (number < min) {
                    min = number;
                }
            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        scanner.close();
    }
}
