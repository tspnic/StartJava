package com.startjava.lesson4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int attempt = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[attempt] = number;
        attempt++;
    }

    public int getNumber() {
        return numbers[attempt - 1];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length - (numbers.length - attempt));
    }
}
