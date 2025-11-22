package com.codewithmosh;

import java.util.Arrays;

public class ArraysX {

	public static void main() {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		System.out.println(Arrays.toString(numbers));
		
		int[] numbers2 = {2,7,1,10,9};
		System.out.println(numbers2.length);
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		
		int[][] numbers3 = new int[2][3];
		numbers3[0][0] = 1;
		System.out.println(Arrays.deepToString(numbers3));
		
		int[][] numbers4 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(numbers4));
	}
}
