package com.codewithmosh;

import java.util.Scanner;

public class ReadingInput {

	public static void main() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age : ");
		byte age = scanner.nextByte();
		System.out.println("You are " + age);
		scanner.nextLine();
		System.out.print("Name : ");
		String name = scanner.nextLine().trim();
		System.out.println("You are " + name);
		scanner.close();
	}
}
