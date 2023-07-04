package com.collectionexersice;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		creating HashMap
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
//      adding element
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 400);
		hm.put("d", 300);
		hm.put("a", 500);

//		displaying TreeSet
//		System.out.println(hm.get("a"));

		Set<Map.Entry<String, Integer>> st = hm.entrySet();
		for (Map.Entry<String, Integer> me : st) {
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue());
		}

//		traveros on the element of Hashset
		Set se = hm.entrySet();
		Iterator it = se.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey()+ " :");
			System.out.println(me.getValue());

		}

	}
}
