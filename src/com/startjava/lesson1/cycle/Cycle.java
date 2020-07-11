package com.startjava.lesson1.cycle;

class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int x = 6;
		System.out.println(x);
		while (x > -6) {
			x -= 2;
			System.out.println(x);
		}

		int y = 10;
		int sumOdd = 0;
		do {
			y++;
			if (y % 2 > 0) {
				sumOdd += y;
			}
		} while (y < 20);
		System.out.println(sumOdd);
	}
}