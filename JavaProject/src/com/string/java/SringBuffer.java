package com.string.java;

public class SringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer reverse= new StringBuffer("Villu");
		/*
		 * StringBuffer is a peer class of String that provides much of the functionality of strings. 
		 * String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.
		 * 	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
		 * StringBuffer is less efficient than StringBuilder.
		 */
		reverse.reverse();
		System.out.println(reverse);
		StringBuffer buffer= new StringBuffer("Villu");
		buffer.append(" Vicky");
		System.out.println(buffer);
		StringBuffer replace= new StringBuffer("Villu");
		System.out.println(replace.replace(0, 5, "Vicky"));
		StringBuffer delete= new StringBuffer("XYZVillu");
		System.out.println(delete.delete(0, 3));
		StringBuffer insert= new StringBuffer("Villu");
		System.out.println(insert.insert(5, "Vicky"));
		System.out.println(insert.capacity());
		
		/*
		 * he StringBuilder in Java represents a mutable sequence of characters. 
		 * Since the String Class in Java creates and immutable sequence of characters, 
		 * the StringBuilder class provides an alternate to String Class, as it creates a mutable sequence of characters.
		 * StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
		 * 	StringBuilder is more efficient than StringBuffer. 
		 */
		
		StringBuilder reverse1= new StringBuilder("Villu");
		System.out.println(reverse1.reverse());
		StringBuilder buffer2= new StringBuilder("Villu");
		buffer2.append(" Vicky");
		System.out.println(buffer);
		StringBuilder replace2= new StringBuilder("Villu");
		System.out.println(replace2.replace(0, 5, "Vicky"));
		StringBuilder delete2= new StringBuilder("XYZVillu");
		System.out.println(delete2.delete(0, 3));
		StringBuilder insert2= new StringBuilder("Villu");
		System.out.println(insert2.insert(5, "Vicky"));
		System.out.println(insert2.capacity());
		
	      long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Java");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	    }  
	}


