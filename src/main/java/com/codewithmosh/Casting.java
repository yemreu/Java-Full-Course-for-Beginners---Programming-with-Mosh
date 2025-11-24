package com.codewithmosh;

public class Casting {

	public static void main() {
		// Implicit casting
		// byte > short > int > long > float > double
		short x = 1;
		int y = x + 2; // numeric promotion
		System.out.println(y);
		double k = 1.1;
		double l = k + 2;
		System.out.println(l);
		double a = 1.1;
		int b = (int) a + 2;
		System.out.println(b);
		String i = "1.1";
		double j = Double.parseDouble(i);
		System.out.println(j);
	}
}
