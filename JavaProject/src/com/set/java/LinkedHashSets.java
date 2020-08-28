package com.set.java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<String>();//insertion order maintained

		set.add("ku");
		set.add("u");
		set.add("p");
		set.add("l");
		set.add("k");//Duplicates not allowed
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