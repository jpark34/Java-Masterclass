package com.masterclass;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int lastDigit = 0;
        int originalNumber = number;

        while (number > 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        if (originalNumber == reverse) {
            return true;
        }
         return false;
    }
}
