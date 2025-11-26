package com.codewithmosh;

public class SwitchStatement {

	public static void main() {
		int role = 3;
		switch (role) {
			case 1:
				System.out.println("You're an admin");
				break;
			case 2:
				System.out.println("You're an moderator");
				break;
			default:
				System.out.println("You're a guest");
		}
	}
}
