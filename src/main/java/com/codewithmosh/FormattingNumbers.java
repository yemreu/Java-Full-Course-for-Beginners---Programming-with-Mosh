package com.codewithmosh;

import java.text.NumberFormat;

public class FormattingNumbers {

	public static void main() {
		// $1,234,567
		// 10%
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String currency_result = currency.format(123456.789);
		System.out.println(currency_result);
		NumberFormat percent = NumberFormat.getPercentInstance();
		String percent_result = percent.format(0.1);
		System.out.println(percent_result);
		System.out.println(NumberFormat.getPercentInstance().format(0.25));
	}
}
