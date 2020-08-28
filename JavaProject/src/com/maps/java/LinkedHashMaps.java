package com.maps.java;


import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> maps= new LinkedHashMap<String, String>();//insertion order maintained
		maps.put("Me", "Vicky");
		maps.put("cousin", "Nisha");
		maps.put("bro", "Prahash");
		maps.put("Dad", "Kannan");
		maps.put(null, "Nothing"); //null value can be inserted
		System.out.println(maps);
		
		HashMap<String, String> maps2= new HashMap<String, String>();//insertion order not maintained
		maps2.put("Me", "Vicky");
		maps2.put("cousin", "Nisha");	
		maps2.put("bro", "Prahash");
		maps2.put("Dad", "Kannan");
		maps2.put(null, "Nothing");//null value can be inserted
		System.out.println(maps2);
	}

}
