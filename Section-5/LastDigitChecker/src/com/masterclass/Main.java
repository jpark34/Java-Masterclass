package com.masterclass;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println("******");
        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ( num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) {
            return false;
        }

        int right1 = num1 % 10;
        int right2 = num2 % 10;
        int right3 = num3 % 10;

        if ( right1 == right2 || right1 == right3 || right2 == right3 ) {
            return true;
        }

        return false;
    }

    public static boolean isValid(int num) {
        if (num > 9 && num < 1001) {
            return true;
        }
        return false;
    }
}
