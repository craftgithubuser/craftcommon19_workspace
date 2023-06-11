package com.exersice;
import java.util.*;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
//		write the  count number of digits in a number.
//		the number 347 has 3 digits.
 
int numb = 1, n = 347;
int count =2;

// while loop from 1 to 3
while(numb>0) {
	numb = numb/8;
	count++;
}
  System.out.println("count number of digits is:"  + count);
}   
}
		


