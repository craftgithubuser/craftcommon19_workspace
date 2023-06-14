package com.icraftjava;

public class InstanceVaribleDemo {
	 int age = 25;//  Instance Variable /declare outside methods
	   public void methodone(){
		int i =30;//  local variable
		System.out.println("value of i:" +i);
		System.out.println("value of age:" + age);
	}
	    public void methodtwo() {
		int k = 20;//  local variable
		System.out.println("value of k:"+ k);
		System.out.println("value of age:" + age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVaribleDemo m1 = new InstanceVaribleDemo();
		m1.age = 27;
		m1.methodone();
		m1.methodtwo();
		
		InstanceVaribleDemo m2 = new InstanceVaribleDemo();
		m2.methodone();
		
		InstanceVaribleDemo m3 = new InstanceVaribleDemo();
		
		InstanceVaribleDemo m4 = new InstanceVaribleDemo();
	
	}
}
