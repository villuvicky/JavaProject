package com.basic.java;

import java.lang.reflect.Method;

public class GettingNames {
	
	
	public static void Method1() {
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GettingNames obj1= new GettingNames();
		String M1=obj1.getClass().getMethods().toString();
		System.out.println(M1);
	}

}
