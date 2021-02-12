package com.basic.java;

public class ConstructorDemo {

	 public ConstructorDemo() // it cannot be static and do not have return type
	
	/*Constructors are used to initialize the object’s state. Like methods, 
	a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation.
	
	*So constructors are used to assign values to the class variables at the time of object creation, 
	*either explicitly done by the programmer or by Java itself (default constructor).
	*/
	
	
	
	{
		
		System.out.println("I am in constructor");
		
	}
	
	
	 ConstructorDemo(int a , int b)
	 {
		 
		 System.out.println(a+b);
	 }
	 
	

	public static void main(String[] args) {
		
		ConstructorDemo Demo= new ConstructorDemo(); //constructor is called by default
		
		ConstructorDemo Demo2= new ConstructorDemo(5,6);  // if parameterized constructor is defined then you have to explicitly put constructor 
		
		ConstructorDemo Demo3= new ConstructorDemo(5,7);
		
	}

}
