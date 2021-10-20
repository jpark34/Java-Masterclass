package com.masterclass;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 13));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if ( num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99 ) {
            return false;
        }

        int originalNum2 = num2;

        while (num1 > 0) {
            int digit = num1 % 10;

            while (num2 > 0) {
                int digit2 = num2 % 10;

                if (digit == digit2) {
                    return true;
                }
                num2 /= 10;
            }

            num2 = originalNum2;
            num1 /= 10;
        }

        return false;
    }
}
