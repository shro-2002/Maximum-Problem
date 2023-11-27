package com.bridgelabs.MaxMin;

public class MaxGenerics {
	public static void main(String[] args) {
		System.out.println("Welcome to the program to find the maximum number");

		// Test Case 1
		maxNumber(30, 20, 10);

		// Test Case 2
		maxNumber(10, 50, 20);

		// Test Case 3
		maxNumber(10, 20, 70);

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

}
