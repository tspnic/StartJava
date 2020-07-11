package com.startjava.lesson1.calculator;

import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		System.out.println("Enter any two integer");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println("Enter math operation sign");
		char operation = scan.next().charAt(0);

		if (operation == '^') {
			int result = 1;
			for (int i = 1; i <= number2; i++) {
				result *= number1;
			}
			System. out.println(result);
		} else if (operation == '+') {
			System. out.println(number1 + number2);
		} else if (operation == '-') {
			System. out.println(number1 - number2);
		} else if (operation == '/') {
			System. out.println(number1 / number2);
		} else if (operation == '*') {
			System. out.println(number1 * number2);
		} else {
			System. out.println(number1 % number2);
		}
	}
}