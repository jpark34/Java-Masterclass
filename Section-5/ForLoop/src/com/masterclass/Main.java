package com.masterclass;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println();

        // Allows you to do the above prints easier, cleaner, and faster by using a for loop
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println();

        // Same loop as above but going down
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println();

        /* Create a for statement using any range of numbers
            Determine if the number is a prime number using the isPrime method
            If it is a prime number, print it out and increment a count of the number of prime numbers found
            Once the count equals 3 exit the for loop (Hint: use a break; statement to exit the for loop)
         */
        int primeCounter = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCounter += 1;
            }
            if (primeCounter == 3) {
                break;
            }
        }
    }

    // return if the passed parameter is a prime number
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100) );
    }
}
