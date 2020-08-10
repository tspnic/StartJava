package com.startjava.lesson4.calculator;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "Yes";
        String expression;

        while (answer.equals("Yes")) {
            System.out.print("Enter math expression in 2 + 2 format with spaces between characters  ");
            expression = scan.nextLine();
            Calculator calc = new Calculator(expression);
            System.out.println(calc.calculate());
            do {
                System.out.print("Want to continue? [Yes/No]:  ");
                answer = scan.nextLine();
            } while (!answer.equals("Yes") && !answer.equals("No"));
        }
    }
}