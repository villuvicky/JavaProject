package com.maps.java;


import java.util.Hashtable;

public class HashTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> maps= new Hashtable<Integer, String>(); 
		/*
		 * It is similar to HashMap, but is synchronized.
		 * Hashtable(): This creates an empty hashtable with the default load factor of 0.75 and an initial capacity is 11. 
		 */
		maps.put(1, "Vicky");
		maps.put(2, "Nisha");
		maps.put(3, "Prahash");
		maps.put(4, "vkcy");
		maps.put(4, "Kannan");//it will override the above value
		//maps.put(null, null);//null value can not  be inserted
		
	}

}
