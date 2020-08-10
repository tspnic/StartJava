package com.startjava.lesson4.game;

import java.util.Arrays;
import java.util.Scanner;

class GuessNumber {

    int unknownNumber = (int) (Math.random() * 101);
    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int attempt;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        do {
            System.out.println("You have 10 attempts");
            for (attempt = 0; attempt < 10; attempt++) {
                System.out.print("First player entered the number from 0 to 100  ");
                player1.setNumber(scan.nextInt());
                if (player1.getNumber() == unknownNumber) {
                    comparisonNumbers();
                    break;
                } else {
                    System.out.println("Entered number is " + ((player1.getNumber() < unknownNumber) ? "less" : "greater") + " than guessed");
                }

                System.out.print("Second player entered the number from 0 to 100  ");
                player2.setNumber(scan.nextInt());
                if (player2.getNumber() == unknownNumber) {
                    comparisonNumbers();
                    break;
                } else {
                    System.out.println("Entered number is " + ((player2.getNumber() < unknownNumber) ? "less" : "greater") + " than guessed");
                }
            }
            if (attempt > 9) {
                notGuessNumbers();
            }
            break;
        } while (true);
    }

    public void comparisonNumbers() {
        if (player1.getNumber() == unknownNumber || player2.getNumber() == unknownNumber) {
            System.out.print(Arrays.toString(player1.getNumbers()) + " ");
            System.out.println();
            System.out.print(Arrays.toString(player2.getNumbers()) + " ");
            System.out.println();
            if (player1.getNumber() == unknownNumber) {
                System.out.println("Player " + player1.getName() + " guess number " + player1.getNumber() + " from " + ++attempt + " attempts");
            } else {
                System.out.println("Player " + player2.getName() + " guess number " + player2.getNumber() + " from " + ++attempt + " attempts");
            }
        }
    }

    public void notGuessNumbers() {
        System.out.println("At " + player1.getName() + " ended attempts");
        System.out.print(Arrays.toString(player1.getNumbers()) + " ");
        Arrays.fill(player1.getNumbers(), 0);
        System.out.println();
        System.out.println("At " + player2.getName() + " ended attempts");
        System.out.print(Arrays.toString(player2.getNumbers()) + " ");
        Arrays.fill(player2.getNumbers(), 0);
        System.out.println();
    }
}