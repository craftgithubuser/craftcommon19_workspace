package com.IfElsecondition;

import java.util.*;

public class IfElseLadderStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int number = 0;

		// checks if number is greater than 0
		if (number > 0) {
			System.out.println("The number is positive.");
		}

		// checks if number is less than 0
		else if (number < 0) {
			System.out.println("The number is negative.");
		}

		// if both condition is false
		else {
			System.out.println("The number is 0.");
		}
	}

}
