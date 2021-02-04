package com.basic.java;

public class Variables {


	int engMarks; //instance variables and can be accessed by creating objects
	int mathsMarks; 
	int phyMarks;
	public static double salary; 
	public static String name = "Harsh";//static variables 

	public  void StudentAge() 
	{ // local variable age 
		int age = 0; 
		age = age + 5; 
		System.out.println("Student age is : " + age); 

		salary=10;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables obj1 = new Variables(); 
		obj1.engMarks = 50; 
		obj1.mathsMarks = 80; 
		obj1.phyMarks = 90; 

		// second object 
		Variables obj2 = new Variables(); 
		obj2.engMarks = 80; 
		obj2.mathsMarks = 60; 
		obj2.phyMarks = 85; 

		// displaying marks for first object 
		System.out.println("Marks for first object:"); 
		System.out.println(obj1.engMarks); 
		System.out.println(obj1.mathsMarks); 
		System.out.println(obj1.phyMarks); 

		// displaying marks for second object 
		System.out.println("Marks for second object:"); 
		System.out.println(obj2.engMarks); 
		System.out.println(obj2.mathsMarks); 
		System.out.println(obj2.phyMarks);
		
		obj1.StudentAge();
		
		System.out.println(salary+ " " + name);

	}

}
