package com.set.java;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	
	/*Set interface implements Hash set,Tree set, Linked set
	 * Insertion order not maintained
	 * Duplicates not allowed
	 * null can be added
	 * cannot fetch based on index
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set= new HashSet<String>();//insertion order not maintained
		set.add("ku");
		set.add("u");
		set.add("p");
		set.add("l");
		set.add("ku");//Duplicates not allowed
		set.add(null);//null can be added
		System.out.println(set);
		set.remove(null);
		System.out.println(set);
		System.out.println(set.contains("u"));

		Iterator<String> values= set.iterator();
		while (values.hasNext()) {
			System.out.println(values.next().hashCode());
			

		}
	}

}
