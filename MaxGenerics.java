package com.bridgelabs.MaxMin;

public class MaxGenerics {
	public static void main(String[] args) {
		System.out.println("Welcome to the program to find the maximum number");

		// Test Case 1 - Integer
		System.out.println("Integer Maximum");
		testMax(30, 20, 10);
		System.out.println();

		// Test Case 2 - Float
		System.out.println("Float Maximum");
		testMax(1.5f, 10.5f, 5.5f);
		System.out.println();

		// Test Case 3 - String
		System.out.println("String Maximum");
		testMax("Satoru", "Nanami", "Suguru");
		System.out.println();

	}

	/*
	 * @params: T,T,T
	 * 
	 * @return: void
	 * 
	 * @Description: This method takes 3 Generics and finds the maximum among them
	 */

	public static <T extends Comparable<T>> void testMax(T a, T b, T c) {
		T max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		System.out.println("The maximum  is " + max);
	}

}
