package com.loops;
import java.util.Scanner;

public class WhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Java program to find the sum of positive numbers
		int sum = 0;

		// create an object of Scanner class
		Scanner input = new Scanner(System.in);

		// take integer input from the user
		System.out.println("Enter a number");
		int number = input.nextInt();

		// while loop continues
		// until entered number is positive
		while (number >= 0) {
			// add only positive numbers
			sum += number;

			System.out.println("Enter a number");
			number = input.nextInt();
		}

		System.out.println("Sum = " + sum);
		input.close();
	}

}
