package com.masterclass;

public class Main {

    public static void main(String[] args) {
        numberToWords(123);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber = reverse(number);
            for (int i = 0; i < getDigitCount(number); i++) {
                switch (reverseNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
                reverseNumber /= 10;
            }
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        while (number != 0) {
            reverseNum = (reverseNum * 10) + number % 10;
            number /= 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int digitCount = 0;
        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}
