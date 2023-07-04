package com.collectionexersice;

import java.util.*;
import java.util.Iterator;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		creating Treeset
		TreeSet<String> Al = new TreeSet<String>();
//      adding element
		Al.add("Ravi");
		Al.add("Vijay");
		Al.add("Ravi");
		Al.add("Ajay");

//		displaying TreeSet
		System.out.println(Al);

//		traveros on the element of Treeset
		Iterator itr = Al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (String elt : Al) {
			System.out.println(elt);
		}
	}
}
