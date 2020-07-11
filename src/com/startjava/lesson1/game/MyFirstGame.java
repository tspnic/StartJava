package com.startjava.lesson1.game;

import java.util.Scanner;
import java.lang.Math;

class MyFirstGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You task is to guess the number");
		System.out.println("Entered the number from 0 to 100");
		int unknownNumber = (int) Math.floor(Math.random() * 101);
		int inputNumber;
		do {
			inputNumber = scanner.nextInt();
			if (inputNumber == unknownNumber) {
				System.out.println("You guess");
				break;
			} else {
				System.out.println("Entered number is " + ((inputNumber < unknownNumber) ? "less" : "greater") + " than guessed");
			}
		} while (true);
	}
}
