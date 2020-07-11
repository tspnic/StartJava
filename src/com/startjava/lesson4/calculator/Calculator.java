package com.startjava.lesson4.calculator;

class Calculator {

    private String[] tokens;
    private String expression;
    private int pos;

    public Calculator(String expression) {
        this.tokens = expression.split(" ");
    }

    public int calculate() {
        int first = Integer.parseInt(tokens[0]);
        char operation = tokens[1].charAt(0);
        int second = Integer.parseInt(tokens[2]);

        switch (operation) {
            case '+':
                System.out.println((int) Math.addExact(first, second));
                break;
            case '-':
                System.out.println((int) Math.subtractExact(first, second));
                break;
            case '*':
                System.out.println((int) Math.multiplyExact(first, second));
                break;
            case '/':
                System.out.println(first / second);
                break;
            case '%':
                System.out.println(first % second);
                break;
            case '^':
                System.out.println((int) Math.pow(first, second));
                break;
            default:
                System.out.println("Error");
        }
        return operation;
    }
}
