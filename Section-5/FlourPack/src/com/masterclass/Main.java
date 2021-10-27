package com.masterclass;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigKilos = bigCount * 5;
        int smallKilos = smallCount;
        if ( (bigKilos + smallKilos) < goal) {
            return false;
        }
        if (bigKilos <= goal) {
            return ((goal - bigKilos) <= smallCount);
        } else {
            return ((goal % 5) <= smallCount);
        }
    }
}
