package com.bridgelabs.MaxMin;

public class MaxRefactor2<T extends Comparable<T>> {

	private T[] values;

	/*
	 * @param: variable-length argument lists
	 * 
	 * @return: int
	 * 
	 * @Description: Parameterized constructor to initialize the variables
	 */

	public MaxRefactor2(T... var) {
		this.values = var;
	}

	/*
	 * @param:None
	 * 
	 * @return: T
	 * 
	 * @Description: Method to find the maximum of three numbers
	 */
	private T findMax() {
		T max = values[0];
		for (T value : values) {
			if (value.compareTo(max) > 0) {
				max = value;
			}
		}
		return max;
	}

	/*
	 * @param: None
	 * 
	 * @return: None
	 * 
	 * @Description: Method to print the maximum of three numbers
	 */

	public void testMaximum() {
		T max = findMax();
		System.out.println("The maximum is " + max);
	}

	public static void main(String[] args) {

		// Test Case 1 - Integer
		MaxRefactor2<Integer> integerMax = new MaxRefactor2<>(30, 20, 10, 90, 80, 55);
		System.out.println("Integer Maximum");
		integerMax.testMaximum();
		System.out.println();

		// Test Case 2 - Float

		MaxRefactor2<Float> floatMax = new MaxRefactor2<>(15.5f, 10.5f, 5.5f);
		System.out.println("Float Maximum");
		floatMax.testMaximum();
		System.out.println();

		// Test Case 3 - String
		MaxRefactor2<String> stringMax = new MaxRefactor2<>("Satoru", "Suguru", "Nanami", "Yuji");
		System.out.println("String Maximum");
		stringMax.testMaximum();
		System.out.println();
	}

}
