package com.bridgelab;

	import java.util.Arrays;

	public class FindMaxValue<T extends Comparable<T>> {

	    T[] elements;

	    public FindMaxValue(T[] elements) {
	        this.elements = elements;
	    }

	    /**
	     * Generic method to store values in array and return maximum value
	     * return max : Maximum of three values
	     */
	    public static <T extends Comparable<T>> T maxOfValues(T[] elements) {
	        Arrays.sort(elements);
	        int lenght = elements.length;
	        T max = elements[lenght - 1];
	        return max;
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to the program to find maximum value using generics");
	        Integer[] intMax = { 10, 20, 30, 40, 21, 16, 99,8 };
	        System.out.println("The Maximum between three integers is : " + maxOfValues(intMax));
	        Float[] floatMax = { 7.5f, 45.3f, 78.2f, 87.3f, 54.6f };
	        System.out.println("The Maximum between three float is : " + maxOfValues(floatMax));
	        String[] stringMax = { "abc", "hgl", "bpl", "ipl", "bbc", "ddn", "psl", "xyz" };
	        System.out.println("The Maximum between three String is : " + maxOfValues(stringMax));
	    }
	}