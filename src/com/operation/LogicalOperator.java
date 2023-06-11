package com.operation;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a &&b =" +(a&&b));
		System.out.println("a||b="+ (a&b));
		System.out.println("!a(a&&b)="+!(a&&b));
		
		// && (AND)operator
		System.out.println((5 > 7) && (8 > 5)); // true
		System.out.println((5 > 3) && (8 < 5)); // false

		// ||(OR) operator
		System.out.println((5 < 3) || (8 > 5)); // true
		System.out.println((5 > 3) || (8 < 5)); // true
		System.out.println((5 < 3) || (8 < 5)); // false

		// !(NOT)operator
		System.out.println(!(5 == 3)); // true
		System.out.println(!(5 > 3)); // false
		 
	}

}
