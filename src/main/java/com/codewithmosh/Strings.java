package com.codewithmosh;

public class Strings {

	public static void main() {
		String message = "Hello World" + "!!";
		System.out.println(message);
		System.out.println(message.endsWith("!!"));
		System.out.println(message.startsWith("!!"));
		System.out.println(message.length());
		System.out.println(message.indexOf("sky"));
		System.out.println(message.replace("!", "*"));
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		message = "    Hello World!!";
		System.out.println(message.trim());
	}
}
