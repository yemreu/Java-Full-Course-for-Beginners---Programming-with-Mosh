package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main() {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Principal: ");
		int principal = scanner.nextInt();
		System.out.print("Annual Interest Rate: ");
		float annualInterestRate = scanner.nextFloat();
		float monthlyInterestRate = (annualInterestRate / MONTHS_IN_YEAR) / PERCENT;
		System.out.print("Period (Years): ");
		byte periodInYears = scanner.nextByte();
		int numberOfPayments = periodInYears * MONTHS_IN_YEAR;
		double mortgage = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
		System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
		scanner.close();
	}
}
