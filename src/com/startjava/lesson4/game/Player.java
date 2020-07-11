package com.startjava.lesson4.game;

public class Player {

    private String name;
    private int number;
    int pos = -1;

	public Player(String name) {
	    this.name = name;
    }

    public String getName() {
	    return name;
    }

    public int setNumber(int number) {
        this.number = number;
        return number;
    }

    public int getNumber() {
	    return number;
    }
}
