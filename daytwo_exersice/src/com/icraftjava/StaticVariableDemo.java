package com.icraftjava;

public class StaticVariableDemo {
	
	public static double salary;
	public static String dept = "finance";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVariableDemo m1 = new StaticVariableDemo();
		salary = 1000;
		System.out.println("dept:" + dept);
		System.out.println("salary:" + salary);
	}

}
