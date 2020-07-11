package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		String answer = "Yes";

		while (answer.equals("Yes")) {

			System.out.print("Enter the first number ");
			calculator.setNum1(scan.nextInt());
			System.out.print("Enter math operation sign ");
			calculator.setOperation(scan.next().charAt(0));
			System.out.print("Enter the second number ");
			calculator.setNum2(scan.nextInt());
			calculator.calculate();
			do {
				System.out.print("Want to continue? [Yes/No]: ");
				answer = scan.next();
			} while (!answer.equals("Yes") && !answer.equals("No"));
		}
	}
}