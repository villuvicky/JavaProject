package com.maps.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {
	// The map interface is also part of the java collection framework, but it doesn�t inherit the collection of the interface.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> maps= new HashMap<Integer, String>();
		maps.put(1, "Vicky");
		maps.put(2, "Nisha");
		maps.put(3, "Prahash");
		maps.put(4, "vkcy");
		maps.put(4, "Kannan");//it will override the above value
		maps.put(null, null);//null value can be inserted
		maps.put(null, "Hey");
		System.out.println(maps);
		HashMap<Integer, String> Duplicatemaps= new HashMap<Integer, String>();
		Duplicatemaps.putAll(maps);
		System.out.println(Duplicatemaps);
		Duplicatemaps.clear();
		System.out.println(Duplicatemaps);
		System.out.println(maps.containsKey(2));
		System.out.println(maps.containsValue("Kannan"));
		System.out.println(maps.get(3));
		System.out.println(maps.entrySet());
		System.out.println(maps.keySet());
		System.out.println(maps.values());

		
		for (Integer keys : maps.keySet()) {
			System.out.println(keys);
		}
		for (String values : maps.values()) {
			System.out.println(values);
		}
		
		for (Map.Entry<Integer,String> entry : maps.entrySet()) 
		{
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
    } 
	}
}
