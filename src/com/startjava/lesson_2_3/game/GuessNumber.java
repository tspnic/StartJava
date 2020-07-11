package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.lang.Math;

class GuessNumber {

	Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() { 
		int unknownNumber = (int) (Math.random() * 101);
		do {
			System.out.print("Entered the number from 0 to 100  ");
			player1.setNumber(scan.nextInt());
			if (player1.getNumber() == unknownNumber) {
				System.out.println("You guessed - " + player1.getName());
				break;
			} else {
				System.out.println("Entered number is " + ((player1.getNumber() < unknownNumber ) ? "less" : "greater") + " than guessed");
			}

			System.out.print("Entered the number from 0 to 100  ");
			player2.setNumber(scan.nextInt());
			if (player2.getNumber() == unknownNumber) {
				System.out.println("You guessed - " + player2.getName());
				break;
			} else {
				System.out.println("Entered number is " + ((player2.getNumber() < unknownNumber) ? "less" : "greater") + " than guessed");
			}
		} while (true);
	}
}