package com.exersice2;
	import java.util.Scanner;

	public class ReadIntegers {
	    private static Scanner scanner = new Scanner(System.in);
	    
	    public static void main(String[] args) {
	        int count = readCount();
	        int[] numbers = readIntegers(count);
	        int minValue = findMin(numbers);
	        
	        System.out.println("Minimum element: " + minValue);
	    }
	    
	    // Method to read the count of integers from the console
	    private static int readCount() {
	        System.out.print("Enter the count of numbers: ");
	        return scanner.nextInt();
	    }
	    
	    // Method to read integers from the console and return an array
	    private static int[] readIntegers(int count) {
	        int[] numbers = new int[count];
	        
	        System.out.println("Enter " + count + " numbers:");
	        for (int i = 0; i < count; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        
	        return numbers;
	    }
	    
	    // Method to find the minimum value in an array
	    private static int findMin(int[] array) {
	        int min = array[0];
	        
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }
	        
	        return min;
	    }
	    
	}

