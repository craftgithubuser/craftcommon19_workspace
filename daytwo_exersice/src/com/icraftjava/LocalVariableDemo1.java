package com.icraftjava;

public class LocalVariableDemo1 {
	
	public void methodone(){
		int j =30;//  local variable
		System.out.println("value of j:" + j);
	}
	    public void methodtwo() {
		int k = 10;//  local variable
		System.out.println("value of k:"+ k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalVaribleDemo2 m1 = new localVaribleDemo2();
		
		m1.methodone();
		m1.methodtwo();
	
		
	}

	
	}

