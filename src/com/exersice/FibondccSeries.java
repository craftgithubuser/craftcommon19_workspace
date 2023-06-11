package com.exersice;

public class FibondccSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		the sequence Fn of fibonacci numbers
//		Fn= Fn-l +Fn-2 
		// f0= 0, f1=1.....fn,
//		 print the first ten terms 
//		the Fibonacci series (0, 1, 1, 2, 3, 5, 8, 13, 21, 34).

		int n = 10;
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");

		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");

			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

}
