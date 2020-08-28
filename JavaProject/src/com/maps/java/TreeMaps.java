package com.maps.java;

import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> places= new TreeMap<String, String>();//insertion order maintained
		//Null insertion is not possible
		places.put("Bus Stand", "Karur");
		places.put("Bye pass", "Karur");
		places.put("Velusamy Puram", "Karur");
		places.put("vadivel nagar", "Karur");
		places.put("vadivel nagar", "trichy");// last value will override the above one
		//places.put(null, "Karur"); null value cannot be inserted
		System.out.println(places);
	}

}
