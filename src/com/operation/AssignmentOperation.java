package com.operation;

public class AssignmentOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d = 30;
		int b = 40;
		int c = 0;
		c = d + b;
		
		System.out.println("c =d+b ="+c);//70
		System.out.println("c +=d =" +c);//100
		System.out.println("c -=d =" +c);//40
		System.out.println("c *d ="+c);//2100
		System.out.println("c /=d =" +c);//23
		System.out.println("c%=d" +c);
		// create variables
		int a = 4;
		int var;

		// assign value using =
		var = a;
		System.out.println("var using =: " + var);

		// assign value using =+
		var += a;
		System.out.println("var using +=: " + var);

		// assign value using =*
		var *= a;
		System.out.println("var using *=: " + var);
	}

}
