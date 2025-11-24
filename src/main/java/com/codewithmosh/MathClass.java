package com.codewithmosh;

public class MathClass {

	public static void main() {
		 int result = Math.round(1.1f);
		 System.out.println(result);
		 result = (int) Math.ceil(1.1f);
		 System.out.println(result);
		 result = (int) Math.floor(1.1f);
		 System.out.println(result);
		 result = Math.max(1, 2);
		 System.out.println(result);
		 double result_d = Math.round(Math.random() * 100);
		 System.out.println((int) result_d);
	}
}
