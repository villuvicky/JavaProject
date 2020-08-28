package com.string.java;

public class SringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer reverse= new StringBuffer("Villu");
		System.out.println(reverse.reverse());
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
	}

}
