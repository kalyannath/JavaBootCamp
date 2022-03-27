package com.company;
/*
30.Generate a random number between 1 and 9 (including 1 and 9). \
Ask the user to guess the number, then tell them whether they
guessed too low, too high, or exactly right.
 */

import java.util.Random;
import java.util.Scanner;

public class Q30GuessGame {
    public static void guessGame() {
        System.out.println("welcome to the guessing game ...");
        System.out.println("guess number between 1 to 9 >>> ");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(9) + 1;
        int guessCount = 1;
        while (true) {
            int guess = sc.nextInt();
            if (guess > r) {
                System.out.println("guess lower >>> ");
            } else if (guess < r) {
                System.out.println("guess higher >>> ");
            } else {
                System.out.println("you have guesses the number.");
                System.out.println("number of guesses = " + guessCount);
                break;
            }
            guessCount++;
        }
    }
    public static void main(String[] args) {
        guessGame();
    }
}
