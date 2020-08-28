package com.basic.java;

public class StaticMethod {
	public int num=5; //common for all methods and class and cannot be used in static methods

	static int number=10; //shared  by the all methods

	public static void method1() {

		System.out.println("I am called without object being created");
		System.out.println(number);
	}
	public void  method2() {

		System.out.println("I am called by created object");
		System.out.println(num);
	}

	public static void main(String[] args) {

		method1(); // No object created to call them static methods are called 
		StaticMethod types= new StaticMethod();
		types.method2();// for non static methods object needs to be created to call them


	}

}
