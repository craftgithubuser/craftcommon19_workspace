package com.collectionexersice;

import java.util.*;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruit = new ArrayList<String>();

//   adding element to ArrayList
		fruit.add("mango");
		fruit.add("Apple");
		fruit.add("Apple");
		fruit.add("Berry");
//   display ArrayList
		System.out.println(fruit);
//   Traversing ArryList 
		for (String element : fruit) {
			System.out.println(element);
		}
		Iterator it = fruit.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		for(int i=0; i<fruit.size(); i++) {
			System.out.print(fruit.get(i)+" ");
		}
		System.out.println();
		System.out.println("using forloop\n");
	}

}
