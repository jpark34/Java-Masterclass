package com.masterclass;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(1001));
    }

    public static int sumFirstAndLastDigit(int number) {
        int first = 0;
        int last = 0;

        if (number < 0) {
            return -1;
        }

        first = number % 10;

        while (number > 0) {
            int digit = number % 10;
            last = digit;
            number /= 10;
        }

        return first + last;
    }
}
