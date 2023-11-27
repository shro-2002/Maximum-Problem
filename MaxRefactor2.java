package com.bridgelabs.MaxMin;

public class MaxRefactor2<T extends Comparable<T>> {

	private T var1;
	private T var2;
	private T var3;

	/*
	 * @param: T, T, T
	 * 
	 * @return: int
	 * 
	 * @Description: Parameterized constructor to initialize the variables
	 */

	public MaxRefactor2(T var1, T var2, T var3) {
		super();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;
	}

	/*
	 * @param: T, T, T
	 * 
	 * @return: T
	 * 
	 * @Description: Method to find the maximum of three numbers
	 */
	private T findMax() {
		T max = var1;
		if (var2.compareTo(max) > 0)
			max = var2;
		if (var3.compareTo(max) > 0)
			max = var3;
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
		MaxRefactor2<Integer> integerMax = new MaxRefactor2<>(30, 20, 10);
		System.out.println("Integer Maximum");
		integerMax.testMaximum();
		System.out.println();

		// Test Case 2 - Float

		MaxRefactor2<Float> floatMax = new MaxRefactor2<>(15.5f, 10.5f, 5.5f);
		System.out.println("Float Maximum");
		floatMax.testMaximum();
		System.out.println();

		// Test Case 3 - String
		MaxRefactor2<String> stringMax = new MaxRefactor2<>("Satoru", "Suguru", "Nanami");
		System.out.println("String Maximum");
		stringMax.testMaximum();
		System.out.println();
	}

}
