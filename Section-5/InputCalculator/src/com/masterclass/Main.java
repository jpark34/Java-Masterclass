package com.masterclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double counter = 0;

        //
        while (true) {
            boolean nextInt = scanner.hasNextInt();

            if (nextInt) {
                int number = scanner.nextInt();

                sum += number;
            } else {
                break;
            }

            counter++;
            scanner.nextLine();
        }


        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(sum / counter));
        scanner.close();
    }
}
