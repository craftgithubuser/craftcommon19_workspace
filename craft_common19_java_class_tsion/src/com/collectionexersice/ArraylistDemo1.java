package com.collectionexersice;

import java.util.*;

public class ArraylistDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method

		ArrayList list = new ArrayList<>();
		list.add("james");
		list.add(10);
		list.add('A');
		list.add(0, "jamie");
//		list.remove(0);
//		System.out.println(list);

		Iterator it = list.iterator();

		while (it.hasNext())
			;
		System.out.println(it.next());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
