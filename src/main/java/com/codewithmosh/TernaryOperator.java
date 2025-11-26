package com.codewithmosh;

public class TernaryOperator {

	public static void main() {
		int income = 120_000;
		String className = income > 100_000 ? "First" : "Economy";
		System.out.println(className);
	}
}
