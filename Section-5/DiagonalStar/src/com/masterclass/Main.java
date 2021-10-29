package com.masterclass;

public class Main {

    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(2);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int rows = 0; rows < number; rows++) {
                for (int column = 0; column < number; column++) {
                    // first or last row
                    if (rows == 0 || rows == (number - 1)) {
                        System.out.print("*");
                    }
                    // first or last column
                    else if (column == 0 || column == (number - 1)) {
                        System.out.print("*");
                    }
                    // row equals column
                    else if (rows == column) {
                        System.out.print("*");
                    }
                    // column equals number - currentRow + 1
                    else if (column == (number - rows) - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
