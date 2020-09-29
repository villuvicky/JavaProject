package com.string.java;

import java.util.Arrays;
import java.util.List;

public class BasicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Vicky";
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
