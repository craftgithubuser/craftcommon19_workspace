package com.IfElsecondition;
import java.util.*;
public class IfElseLadderStatatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter mark");
		double mark =in.nextDouble();
		String Grade;
		if(mark<=100 && mark >=90) {
			Grade= "A+";
		
		
	}
		else if(mark<80 &&mark >=70) {
			Grade ="B";
			
		}
		else if(mark<70 &&mark >=60) {
			Grade ="C";
			
	}
		else if(mark<60 &&mark >=50) {
			Grade ="D";
			
}
		else {
			Grade ="no grade";
		}
		System.out.println("student Grade" + Grade);
}
	}