package com.startjava.lesson_2_3.calculator;

class Calculator {

	private int num1;
	private char operation;
	private int num2;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public void setNum2(int num2) {
		this.num2 = num2;

	}
	public int calculate() {
		switch (operation) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			case '%':
				System.out.println(num1 % num2);
				break;
			case '^':
				pow();
				break;
			default:
				System.out.println("Error");
		}
		return operation;
	}

	private void pow() {
		int result = 1;
		for (int i = 1; i <= num2; i++) {
		result *= num1;
		}
		System.out.println(result);
	} 
}
