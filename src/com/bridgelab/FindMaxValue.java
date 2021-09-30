package com.bridgelab;

public class FindMaxValue {
	/**
	 * Method used to compare three integer values and get the maximum value. a1 :
	 * First value to compare a2 : Second value to compare a3 : Third value to
	 * compare return max : Maximum of three integers
	 */
	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the program to find maximum value ");
		Integer a1 = 3, a2 = 4, a3 = 9;
		System.out.println("The Maximum between three integers is : " + maxOfInteger(a1, a2, a3));
	}
}
