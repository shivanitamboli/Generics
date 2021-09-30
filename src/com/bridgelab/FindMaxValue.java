package com.bridgelab;

public class FindMaxValue<T extends Comparable<T>> {

	T a1, a2, a3;

	public FindMaxValue(T a1, T a2, T a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	/**
	 * Generic method to compare any type of data and find maximum a1 : First value
	 * to compare a2 : Second value to compare a3 : Third value to compare return
	 * max : Maximum of three values
	 */
	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the program to find maximum value ");
		Integer a1 = 30, a2 = 40, a3 = 90;
		System.out.println("The Maximum between three integers is : " + maxOfValues(a1, a2, a3));
		Float f1 = 3.5f, f2 = 9.4f, f3 = 7.1f;
		System.out.println("The Maximum between three float is : " + maxOfValues(f1, f2, f3));
		String s1 = "abc", s2 = "pqr", s3 = "xyz";
		System.out.println("The Maximum between three String is : " + maxOfValues(s1, s2, s3));
	}

}
