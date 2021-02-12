package com.basic.java;

import java.lang.reflect.Method;


/*static is a non-access modifier in Java which is applicable for the following:

   blocks
   variables
   methods
   nested classes  */


public class StaticMethod {
	public int num=5; //common for all methods and class and cannot be used in static methods

	static int k;

	StaticMethod() {
		// TODO Auto-generated constructor stub
		num++;
	}


	static int number=10; //shared  by the all methods

	public static void method1() {

		System.out.println("I am called without object being created");
		System.out.println(number);

	}
	public  void m1() 
	{ 
		System.out.println("Called by created object"); 

		// calling m2() method within the same class. 
		this.method2(); 

		// statements to be executed if any 

	} 
	public void  method2() {

		System.out.println("I am called by m1 pn this keyword");
		System.out.println(num);
	}

	public static void main(String[] args) {

		method1(); // No object created to call them static methods are called 
		StaticMethod types= new StaticMethod();
		types.m1();// for non static methods object needs to be created to call them
		System.out.println(k);
		//Nothing is assigned then system will give zero


		Method M[] =types.getClass().getDeclaredMethods();  //to get methods
		for (Method method : M) {
			System.out.println(method.getName());
		}
	}

}
