package com.collectionexersice;

import java.util.*;

public class HshsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		creating hashset
		HashSet<String> hs = new HashSet<String>();
//      adding element
		hs.add("Moha");
		hs.add("Rohan");
		hs.add("Sohan");
		hs.add("Mohan");

//		displaying Hsheset
		System.out.println(hs);

//		traveros on the element of hashse
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (String elt : hs) {
		System.out.println(elt);
		}

	}
}
