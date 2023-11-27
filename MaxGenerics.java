package com.bridgelabs.MaxMin;

public class MaxGenerics {
	public static void main(String[] args) {
		System.out.println("Welcome to the program to find the maximum number");

		// Integer
		
		// Test Case 1
		System.out.println("Test Case 1");
		maxNumber(30, 20, 10);
		System.out.println();

		// Test Case 2
		System.out.println("Test Case 2");
		maxNumber(10, 50, 20);
		System.out.println();

		// Test Case 3
		System.out.println("Test Case 3");
		maxNumber(10, 20, 70);
		System.out.println();

		// Float

		// Test Case 1

		System.out.println("Test Case 1");
		maxNumber1(15.5f, 10.5f, 5.5f);

		// Test Case 2
		System.out.println("Test Case 2");
		maxNumber1(6.5f, 18.5f, 8.5f);

		// Test Case 3
		System.out.println("Test Case 3");
		maxNumber1(9.5f, 12.5f, 34.5f);

	}

	/*
	 * @params: int, int, int
	 * 
	 * @return: void
	 * 
	 * @Description: This method takes 3 integers and finds the maximum among them
	 */

	public static void maxNumber(Integer a, Integer b, Integer c) {
		Integer max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		System.out.println("The maximum number is " + max);
	}

	/*
	 * @params: Float , Float , Float
	 * 
	 * @return: void
	 * 
	 * @Description: This method takes 3 floats and finds the maximum among them
	 */
	public static void maxNumber1(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		System.out.println("The maximum number is " + max);
	}

}
