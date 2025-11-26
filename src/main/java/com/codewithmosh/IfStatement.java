package com.codewithmosh;

public class IfStatement {

	public static void main() {
		int temp = 21;
		if (temp > 30) {
			System.out.println("It's a hot day. Drink plenty of water.");
		} else if (temp > 20) {
			System.out.println("It's a nice day.");
		} else {
			System.out.println("It's cold.");
		}
		
		int income = 120_000;
		boolean hasHighIncome = false; // income > 100_000;
		if(income > 100_000) {
			hasHighIncome = true;
		}
		System.out.println(hasHighIncome);
	}
}
