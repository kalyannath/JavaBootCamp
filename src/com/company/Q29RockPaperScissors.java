package com.company;

import java.util.Scanner;

/*
29.Make a two-player Rock-Paper-Scissors game.
 */
public class Q29RockPaperScissors {
    public static void rockPaperScissors() {
        System.out.println("welcome to rock paper scissors game >>>");
        System.out.println("enter 'r' for rock 'p' for paper 's' for scissors...");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Player 1 turn >>> ");
            String p1 = sc.next();
            if (p1.equals("r") || p1.equals("p") || p1.equals("s")) {
                System.out.println("Player 2 turn >>> ");
                String p2 = sc.next();

                if (p2.equals("r") || p2.equals("p") || p2.equals("s")) {
                    if (p1.equals(p2)) {
                        System.out.println("draw game ... ");
                    } else if ((p1.equals("r") && p2.equals("s")) ||
                            (p1.equals("p") && p2.equals("r")) ||
                            (p1.equals("s") && p2.equals("p"))) {
                        System.out.println("player 1 won...");
                    } else {
                        System.out.println("player 2 won");
                    }
                } else {
                    System.out.println("player 2 select valid weapon");
                }
            } else {
                System.out.println("player 1 select valid weapon");
            }
            System.out.println("enter 'y' to  play again or anything else to quit the game>>>");
            String again = sc.next();
            if (!(again.equals("y"))) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        rockPaperScissors();
    }
}
