package com.startjava.lesson1.conditional;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 50;
		if (age > 20) {
			System.out.println("Your age " + age);
		}

		char firstGenderLetter = 'M';
		if (firstGenderLetter == 'M') {
			System.out.println("Your are male");
		} else if (firstGenderLetter != 'M') {
			System.out.println("Your are female");
		}

		float height = 1.78F;
		if (height < 1.80) {
			System.out.println("Your height = " + height);
		} else {
			System.out.println("Your height = " + height);
		}

		char firstNameLetter = 'S';
		if (firstNameLetter == 'M') {
			System.out.println("Your name is Michael");
		} else if (firstNameLetter == 'I') {
			System.out.println("Your name is Igor");
		} else {
			System.out.println("Your name is Sergey");
		}
	}
}