package com.collection.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayList {

	/*The Java collections framework is a set of classes and interfaces that implement commonly reusable collection data structures.
	 *The Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.
	 *Collection and map are classes, list and set  are interfaces
	 *It is an ordered collection of objects in which duplicate values can be stored. 
	 *Since List preserves the insertion order, it allows positional access and insertion of elements.
	 *ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
	 *ArrayList,LinkedList, vector implements List interface
	 */

	public static void arraylisting() {

		List<String> list= new ArrayList<String>();
		//List<Object> listing= new ArrayList<Object>();-- heterogeneous type
		//listing.add(2);
		//listing.add("K");
		list.add("Vicky");
		list.add("kuruvi");
		list.add("villu vicky");
		list.add("villu vicky");
		list.add(2, "Hey Man");  //adding at specific position
		System.out.println(list);
	
		System.out.println(list.get(2));
		System.out.println(list.lastIndexOf("villu vicky"));
		System.out.println(list.indexOf("kuruvi"));
		for (String string : list) {
			if(string.startsWith("v")) {
				System.out.println(string);
			}
		}
		System.out.println(list.stream().filter(s->s.startsWith("V")).count());
		//count is terminal operation
		//filter is intermediate operation
		for (String string : list) {
			System.out.println("using for each "+string);
		}
		ListIterator<String> Listiterator=list.listIterator();
		while (Listiterator.hasNext()) {
			System.out.println("Listiterator "+Listiterator.next());
		}
		while (Listiterator.hasPrevious()) {
			System.out.println("from last  "+Listiterator.previous());	
		}
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println("iterator "+iterator.next());

		}
		System.out.println(list.remove(0));
		list.remove("villu vicky");
		System.out.println(list);
		List<String> secondList= new ArrayList<String>();
		secondList.addAll(list);
		System.out.println(secondList);
		secondList.removeAll(secondList);
		System.out.println(secondList);
		System.out.println(secondList.isEmpty());
		list.set(1, "vicky k");  //to replace the value
		System.out.println(list);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylisting();
	}

}
