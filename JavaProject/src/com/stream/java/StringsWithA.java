package com.stream.java;


import org.testng.Assert;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StringsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> linkedlist= new ArrayList<String>();
		linkedlist.add("Vicky");
		linkedlist.add("Vignesh");
		linkedlist.add("Ashna");
		linkedlist.add("Anikha");
		System.out.println(linkedlist.stream().filter(s->s.startsWith("A")).count());
		
		linkedlist.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		ArrayList<String> linkedlist2= new ArrayList<String>();
		linkedlist2.add("Kannan");
		linkedlist2.add("Prahash");
		linkedlist2.add("Nisha");
		Stream<String> Listing=Stream.concat(linkedlist.stream(), linkedlist2.stream());
		boolean value=Listing.anyMatch(s->s.equalsIgnoreCase("nisha"));
		System.out.println(value);
		Assert.assertTrue(value);
	}

}
