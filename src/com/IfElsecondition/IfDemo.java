package com.IfElsecondition;
import java.util.Scanner;
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you mark");
		double mark = input.nextDouble();
//		we use if statement
		if(mark>75) {
			System.out.println("First Divition");
		}
		else {
			System.out.println("Second Division");
		}
	}

}
