package com.basic.java;


public class StaticVariables {

	 static int value=1000;
	public  int value2=1000;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables var= new StaticVariables();
		StaticVariables.value=20; //Static values can be called with out objects
		System.out.println(value);
		StaticVariables.value=200;
		System.out.println(value);
		var.value2=20;
		System.out.println(var.value2);
		var.value2=200;
		System.out.println(var.value2);
	}

}
