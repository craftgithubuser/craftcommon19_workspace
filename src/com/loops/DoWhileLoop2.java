package com.loops;
import java.util.Scanner;
public class DoWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java program to find the sum of positive numbers

		int sum = 0;
		int number = 0;

		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		// do...while loop continues
		// until entered number is positive
		do {
			// add only positive numbers
			sum += number;
			System.out.println("Enter a number");
			number = input.nextInt();
		} while (number >= 0);

		System.out.println("Sum = " + sum);
		input.close();
	}

}
