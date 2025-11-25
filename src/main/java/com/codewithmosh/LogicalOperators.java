package com.codewithmosh;

public class LogicalOperators {

	public static void main() {
		int temperature = 12;
		boolean isWarm = temperature > 20 && temperature < 30;
		System.out.println(isWarm);
		
		boolean hasHighIncome = true;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		System.out.println(isEligible);
	}
}
