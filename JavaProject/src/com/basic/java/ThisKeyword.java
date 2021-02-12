package com.basic.java;

public class ThisKeyword {

	int a=20;  //instance variables
	int b=10;


	public  void  method1() //method should not be static
	
	{

		int a=5;
		int b=100;

		System.out.println("Inside parameterized constructor " + a+ " "+ b);

		//‘this’ is a reference variable/method that refers to the current class object.

		System.out.println("Inside parameterized constructor and from instance " + this.a+ " "+ this.b);
		
		this.a=a;
		this.b=b;
		
		System.out.println("Inside parameterized constructor " + a+ " "+ b);
		
		
	}




	public static void main(String[] args) {

		ThisKeyword Object1= new ThisKeyword(); 
		Object1.method1();
	}

}
