package com.masterclass;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);
        calculateScore(true, 10000, 8, 200);


        String player = "You";
        displayHighScorePosition(player, calculateHighScorePosition(1500));
        displayHighScorePosition(player, calculateHighScorePosition(900));
        displayHighScorePosition(player, calculateHighScorePosition(400));
        displayHighScorePosition(player, calculateHighScorePosition(50));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore );
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String player, int position) {
        System.out.println("Player \"" + player + "\" got into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        // another possible way to write it
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
