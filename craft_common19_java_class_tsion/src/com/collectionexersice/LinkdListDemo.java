package com.collectionexersice;

import java.util.*;

public class LinkdListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		creating LinkdList
		LinkedList<String> linkedList = new LinkedList<String>();
		
//		adding element
		linkedList.add("deli");
		linkedList.add("newyork");
		linkedList.add("Moscow");
		linkedList.add("dubai");
		
//		displaying LinkedList
		System.out.println(linkedList);
//		Traversing Linkedlist
		for(String elt: linkedList ) {
			System.out.println(elt);
		}
	}

}
