package com.string.java;

import java.util.Arrays;
import java.util.List;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class in java
		
		String FirstName="vignesh"; //string literals and stored in central place and when same values has to be stored it looks for it and shares same.
		String SecondName="vignesh"; // since they are same so only one object will be used
		/*
		 * Strings in Java are Objects that are backed internally by a char array. 
		 * Since arrays are immutable(cannot grow), Strings are immutable as well. 
		 * Whenever a change to a String is made, an entirely new String is created.
		 */
		String s= "java";
		s.concat("code");
		System.out.println(s);//since it is immutable it will refer to old one and prints java
		s=s.concat(" code"); //the String object is immutable, its reference variable is not
		System.out.println(s); //since it is stored in s i will print java code
		System.out.println(FirstName);
		System.out.println(SecondName.toUpperCase());
		String name = new String ("Vicky");//string class and creates new separate memory 
		int number = 3;
		System.out.println("Character sequence " + name.charAt(number));
		System.out.println("length is " + name.length());
		System.out.println(name.equals("vignesh"));
		System.out.println(name.equalsIgnoreCase("VICKY"));
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		System.out.println(name.contains("k"));
		System.out.println(name.substring(1));
		System.out.println(name.substring(0, 3));
		System.out.println(name.concat("vignesh"));
		System.out.println(name.replace("V", "v"));
		System.out.println(name.indexOf("v"));
		System.out.println(name.indexOf("v", 2));
		System.out.println(String.join("/", "15", "02", "1997"));
		String splitThis = "Am,I,teaching,good";
		String[] splittedwords = splitThis.split(",");
		for (String string : splittedwords) {
			System.out.println(string);
		}

		List<String> list = Arrays.asList(name);
		System.out.println(list);
		String names=" vicky  ";
		
		System.out.println(names.trim());//to trim spaces form first and last
	}
	
}
