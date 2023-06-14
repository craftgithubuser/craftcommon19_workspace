package com.exersice2;

import java.util.*;

public class SortIntegerDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Method 1
		// getIntegers returns an array of entered integers from keyboard
		Scanner in = new Scanner(System.in);
	System.out.println("plese entere number of size");
		int size = in.nextInt();
		int getintger[] = new int[size];
	System.out.println("plsease enter the getintger:" +" ");
		for (int i = 0; i < size; i++) {
			getintger[i] = in.nextInt();
		}
		printArray(getintger);
	}
// Method 2
	// printArray prints out the contents of the array
	private static void printArray(int[] printArray) {
		// TODO Auto-generated method stub	System.out.println("please enter number of printArray");
		int size = 5;
		for (int i = 0; i < 5; i++) {
			int printArra[] = { 106, 26, 81, 5, 15 };
		}
	System.out.println(printArray);
	
//	Method 3
//	 sortIntegers should sort the array and return a new array containing the sorted numbers

	sortIntegers(printArray);
	
	}
	private static void sortIntegers(int[] sortIntegers) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] numbers = { 106,26,81,5,15 }; 

		System.out.println("Arrayprint: " + Arrays.toString(numbers));

		// Sort the array in descending order
		Arrays.sort(numbers);
		reverseArray(numbers);

		System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));

	
//	we figure out how to copy the array elements from the passed array into a new
	int[] original = { 106, 26, 81, 5, 15 };
	int [] copy = original;
	System.out.println(" orginal Array is:");
	for(int i=0;i<original.length;i++)
		System.out.print(original[i]);
	
	System.out.println(" copy Array is:");
	for(int i=0;i<copy.length;i++)
		System.out.print(copy[i]);
	
}
	private static void reverseArray(int[] numbers) {
		// TODO Auto-generated method stub
		int start = 0;
		int[] Array;
		int end = Array.length - 1;

		while (start < end) {
			int temp = Array[start];
			Array[start] = Array[end];
			Array[end] = temp;
			start++;
			end--;
		}
	}
}






