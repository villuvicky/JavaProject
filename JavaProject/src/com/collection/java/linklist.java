package com.collection.java;

import java.util.LinkedList;


public class linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> linkedlist= new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(4);
		System.out.println(linkedlist);
		linkedlist.addFirst(1);
		linkedlist.addLast(5);
		System.out.println(linkedlist);
		linkedlist.removeFirst();
		linkedlist.removeLast();
		System.out.println(linkedlist);
		LinkedList<Integer> linkedlist2= new LinkedList<Integer>();
		linkedlist2.add(21);
		linkedlist2.add(31);
		linkedlist2.add(41);
		linkedlist2.add(41);
		System.out.println(linkedlist2);
		linkedlist2.pollLast();
		System.out.println(linkedlist2);
		LinkedList<Integer> linkedlist3= new LinkedList<Integer>();
		linkedlist3.add(22);
		linkedlist3.add(22);
		linkedlist3.add(33);
		linkedlist3.add(33);
		System.out.println(linkedlist3);
		linkedlist3.removeFirstOccurrence(22);
		linkedlist3.removeLastOccurrence(33);
		System.out.println(linkedlist3);
		System.out.println(linkedlist3.hashCode());
		
	}

}
