package com.exersice2;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] numbers = { 106,26,81,5,15 }; // Sample array of integers

		System.out.println("printArra: " + Arrays.toString(numbers));

		// Sort the array in descending order
		Arrays.sort(numbers);
		reverseArray(numbers);

		System.out.println("copy array in descending order: " + Arrays.toString(numbers));
	}

	// Function to reverse the array
	private static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}