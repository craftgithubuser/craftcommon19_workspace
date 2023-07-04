package com.Icraft.day1;
import java.util.*;
import java.util.Arrays;

public class Home_Work {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("please Enter the size of the array");
		int size; 
		size = in.nextInt();
		{
			System.out.println("Please enter numbers: ");
		}
		int array[] = new int[size];
		for(int i =0; i<size; i++) {
			array[i]= in.nextInt();
			
		
			
		}
		//print user array
		System.out.println("Array of entered number:");
		for(int n:array) {
			System.out.println(n + " ");
		}
		System.out.println("\n");
		System.out.println("Sorted array value:");
		Arrays.sort(array);
		for(int A:array) {
			System.out.println(A + " ");
		}
		{
				
			
		}
		
		

	}

}
