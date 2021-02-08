package com.inheritance.java;

public class SuperChild extends SuperParent{

	int maxSpeed = 100; 
	
	
	void message() 
    { 
		super.message();  //The super keyword in java is a reference variable that is used to refer parent class objects
        System.out.println("This is message is in method of Child class"); 
    } 
	
	void display() 
	{
		System.out.println("This is from Superclass "+super.maxSpeed); //super cannot be used in static methods
		
		System.out.println("This is from current child class "+maxSpeed);
	}
	
	
	public static void main(String[] args) {
		
		SuperChild child = new SuperChild();
		child.message();
		child.display();
		
		

	}

}
