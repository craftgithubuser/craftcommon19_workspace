package com.exersice;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 calculate the factorial of a number.
//			n! = 5!=5*4*3*2*1= 120
		 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int numb =in.nextInt();
		int factorial = 1;
		
//		we use for loop
		for(int i=1; i<=numb; i++) {
			factorial = factorial*i;
		}
		System.out.println("factorial of" + numb +"is" +factorial);
		
//		
		}
		
		
	}


