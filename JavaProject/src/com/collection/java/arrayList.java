package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arrayList {

	public static void arraylisting() {
		
		List<String> list= new ArrayList<String>();
		//List<Object> listing= new ArrayList<Object>();-- hetrogeneous type
		//listing.add(2);
		//listing.add("K");
		list.add("Vicky");
		list.add("kuruvi");
		list.add("villu vicky");
		list.add("villu vicky");
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
		list.set(1, "vicky k");
		System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraylisting();
	}

}
