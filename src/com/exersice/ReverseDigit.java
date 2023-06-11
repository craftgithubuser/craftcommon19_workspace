package com.exersice;
import java.util.*;
public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		 
		    //  reverse the digits of a number
//		for example input number is 12345 output number is 54321
		int number = 12345;
		int remainder =0;
		int revnumber= 54321;
		System.out.println("reverse number is:%d"+ revnumber);
//		than we use the while loop
		if(number>0) {
			remainder = number%10;
			number = (revnumber*10)+remainder;
		}
		System.out.println("reverse number is:%d"+ revnumber);
	}
	}
