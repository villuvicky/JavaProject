package com.stream.java;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedlist= new LinkedList<String>();
		linkedlist.add("Vikcy");
		linkedlist.add("Vignesh");
		linkedlist.add("Ashna");
		linkedlist.add("Anikha");
		linkedlist.stream().filter(a->a.length()>5).limit(1).forEach(s->System.out.println(s));
	
		List <String>list= Stream.of("Vicky","Nisha","Kavya").filter(s->s.endsWith("a")).collect(Collectors.toList());
		System.out.println(list.get(0));
		
		List<Integer> values= Arrays.asList(1,3,4,3,2);
		List <Integer> sortedValues=values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(sortedValues);
	}

}
