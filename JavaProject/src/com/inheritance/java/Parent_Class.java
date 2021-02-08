package com.inheritance.java;

public class Parent_Class {

	public static int wheels=4;
	private static String type="car";  //private cannot be inherited as it is class level
	protected static String name="BMW";
	
public  void ReturningToParent() {
	
	System.out.println("car properties are taken from parent class");
	System.out.println("Car type is from Parent class as it is a private "+type);
}
	

}
