package com.set.java;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numset = new TreeSet<Integer>();//stored in order
		numset.add(10);
		numset.add(40);        //string buffer is not implementing comparable class so it cannot be used in tree set
		numset.add(30);
		numset.add(20);
		numset.add(10);
		System.out.println(numset);
		System.out.println(numset.headSet(40));//gives values lesser than it
		System.out.println(numset.tailSet(10));//gives equal or greater than it
		System.out.println(numset.subSet(10, 30));//gives starting values from starting and value before last element
		SortedSet<Integer> set2= new TreeSet<Integer>(); //store in sorted set
		
		set2=numset.subSet(10, 30);
		System.out.println("subset is  "+set2);
		System.out.println(numset.comparator());//returns null if values are already in order
		System.out.println(numset.higher(10));//gives value higher than this
		System.out.println(numset.lower(30));//gives value lower than this
		System.out.println(numset.descendingSet());
		
		Iterator<Integer> iterator=numset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Iterator<Integer> iterator2=numset.descendingIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}
}
