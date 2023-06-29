package com.pojo;
import java.util.*;
public class EmployeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp =new Employee();
		emp.setEmId(100);
		emp.setEmName("Hanif");
		emp.setEmsalary(3000.6);
		
		
		Employee emp2 = new Employee();
		emp2.setEmId(300);
		emp2.setEmName("mohammed");
		emp2.setEmsalary(13000.6);
		
		System.out.println(emp.getEmId()+ " "+ emp.getEmName()+ " " +emp.getEmsalary());
		System.out.println(emp2.getEmId()+ " "+ emp2.getEmName()+ " " +emp2.getEmsalary());
	}

}
