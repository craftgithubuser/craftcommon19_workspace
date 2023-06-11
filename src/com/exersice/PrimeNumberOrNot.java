package com.exersice;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);

//		To check whether a number is prime or not.
//		prime numbers is only 2 factors 1 and itself.It's does not divided multiple no
		
		int num,  whethere =0;
		int i=2;
		int count =whethere;
		System.out.println("enter a posetive integer:"+1);
		// 0 and 1 are not prime numbers
		// change whether to 1 for non-prime number
		if (whethere== 0 || whethere == 1)
		  whethere = 1;
		{
			for(int whether=1; i<=whethere; i++)
				if(i%i==0)
					count++;
			System.out.println("not prime number"+ whethere);
			
		}
		  }
		
	}
	







