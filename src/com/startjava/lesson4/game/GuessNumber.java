package com.startjava.lesson4.game;

import java.util.Scanner;

class GuessNumber {

    Scanner scan = new Scanner(System.in);
    Player player1;
    Player player2;
    int pos = 0;
    int[] numbersFirst = new int[11];
    int[] numbersSecond = new int[11];

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        int unknownNumber = (int) (Math.random() * 101);
        do {
            System.out.println("You have 10 attempts");
            for (pos = 0; pos < 11; pos++) {
                System.out.print("First player entered the number from 0 to 100  ");
                numbersFirst[pos] = player1.setNumber(scan.nextInt());
                if (player1.getNumber() == unknownNumber) {
                    for (int x = 0; x <= pos; x++) {
                        System.out.print(numbersFirst[x] + " ");
                    }
                    System.out.println();
                    for (int y = 0; y <= pos; y++) {
                        System.out.print(numbersSecond[y] + " ");
                    }
                    System.out.println();
                    System.out.println("Player " + player1.getName() + " guess number " + player1.getNumber() + " from " + ++pos + " attempts");
                    break;
                } else {
                    System.out.println("Entered number is " + ((player1.getNumber() < unknownNumber) ? "less" : "greater") + " than guessed");
                }
                if (pos > 9) {
                    System.out.println("At " + player1.getName() + " ended attempts");
                    for (int i = 1; i <= pos; i++) {
                        System.out.print(numbersFirst[i - 1] + " ");
                    }
                }
                System.out.println();
                System.out.print("Second player entered the number from 0 to 100  ");
                numbersSecond[pos] = player2.setNumber(scan.nextInt());
                if (player2.getNumber() == unknownNumber) {
                    for (int x = 0; x <= pos; x++) {
                        System.out.print(numbersFirst[x] + " ");
                    }
                    System.out.println();
                     for (int y = 0; y <= pos; y++) {
                        System.out.print(numbersSecond[y] + " ");
                    }
                    System.out.println();
                    System.out.println("Player " + player2.getName() + " guess number " + player2.getNumber() + " from " + ++pos + " attempts");
                    break;
                } else {
                    System.out.println("Entered number is " + ((player2.getNumber() < unknownNumber) ? "less" : "greater") + " than guessed");
                }
                if (pos > 9) {
                    System.out.println("At " + player2.getName() + " ended attempts");
                    for (int x = 1; x <= pos; x++) {
                        System.out.print(numbersSecond[x - 1] + " ");
                    }
                }
                System.out.println();
            }
            break;
        } while (true);
    }
}