package com.startjava.lesson4.calculator;

class Calculator {

    private String[] splitExpression;
    private int result;

    public Calculator(String expression) {
        this.splitExpression = expression.split(" ");
    }

    public int calculate() {
        int num1 = Integer.parseInt(splitExpression[0]);
        char operation = splitExpression[1].charAt(0);
        int num2 = Integer.parseInt(splitExpression[2]);

        switch (operation) {
            case '+':
                result = (int) Math.addExact(num1, num2);
                break;
            case '-':
                result = (int) Math.subtractExact(num1, num2);
                break;
            case '*':
                result = (int) Math.multiplyExact(num1, num2);
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = (int) Math.pow(num1, num2);
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }
}
