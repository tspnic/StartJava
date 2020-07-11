package com.startjava.lesson_2_3.game;

import java.util.Scanner;

class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = "Yes";
		while (answer.equals("Yes")) {
			System.out.println("You task is to guess the number");
			System.out.print("Enter the name of the first player  ");
			Player player1 = new Player(scan.next());
			System.out.print("Enter the name of the second player  ");
			Player player2 = new Player(scan.next());
			GuessNumber game = new GuessNumber(player1, player2);
			game.startGame();
			do {
				System.out.print("Want to continue? [Yes/No]:  ");
				answer = scan.next();
			} while (!answer.equals("Yes") && !answer.equals("No"));
		}
	}
}