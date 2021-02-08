package com.inheritance.java;



public class Child_Class extends Parent_Class {

	public static void main(String[] args) {
		
		Parent_Class object1= new Child_Class();
		
		object1.ReturningToParent();
		
		System.out.println("the name is "+name);
		System.out.println("the wheels are "+wheels);
		// System.out.println("The type is "+type); it will show error since it is private
		
	}

}
