package com.codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

	public static void main() {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		int principal = 0;
		float annualInterestRate = 0.0f;
		float monthlyInterestRate = 0.0f;
		byte periodInYears = 0;
		int numberOfPayments = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Principal ($1K - $1M): ");
			principal = scanner.nextInt();
			if (principal >= 1_000 && principal <= 1_000_000) {
				break;
			}
			System.out.println("Enter a number between 1,000 and 1,000,000.");
		}

		while (true) {
			System.out.print("Annual Interest Rate: ");
			annualInterestRate = scanner.nextFloat();
			if (annualInterestRate > 0 && annualInterestRate <= 30) {
				monthlyInterestRate = (annualInterestRate / MONTHS_IN_YEAR) / PERCENT;
				break;
			}
			System.out.println("Enter a value greater than 0 and less than or equal to 30.");
		}

		while (true) {
			System.out.print("Period (Years): ");
			periodInYears = scanner.nextByte();
			if (periodInYears > 0 && periodInYears <= 30) {
				numberOfPayments = periodInYears * MONTHS_IN_YEAR;
				break;
			}
			System.out.println("Enter a value between 1 and 30.");
		}

		double mortgage = principal * ((monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
				/ (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1));
		System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
		scanner.close();
	}
}
