package com.icraft.day1;


import java.util.Scanner;

public class Lesson3 {
	
	public static void main(String[] args) {
		
		//Define scanner class
		Scanner in = new Scanner(System.in);
		
		// we promt the use to enter his info
		System.out.println("Pls Insert your first name: ");
		String firstName = in.next();
		
		//Display user info
		System.out.println("Student First Name: " + firstName);
		System.out.println("Pls enter your age: ");
		int age = in.nextInt(); 
		
		
	}

}
