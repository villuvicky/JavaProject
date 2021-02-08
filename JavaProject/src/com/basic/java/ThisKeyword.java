package com.basic.java;

public class ThisKeyword {

	 int a=20;
	 int b=10;


	ThisKeyword(int a , int b) {
		this.a = a; 
		this.b = b; 
		System.out.println("Inside parameterized constructor " + a+ " "+ b); 
	}


	ThisKeyword() {
		this(10,20);
		System.out.println("Inside  default constructor"); 
		
	}


	public static void main(String[] args) {

		ThisKeyword Object1= new ThisKeyword();
		System.out.println( Object1.a+ " "+ Object1.b); 
	}

}
