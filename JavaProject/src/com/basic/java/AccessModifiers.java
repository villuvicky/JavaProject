package com.basic.java;


public class AccessModifiers {

	public int a; //accessible any where outside package as well

	private  int b;  // accessible only in the class

	protected int c;  //  accessible inside package and sub classes outside package

	int d;  // default accessible only in the package

	public void method1() {}

	protected void method2() {}

	private void method3() {}

	public static void main(String[] args) {

		AccessModifiers modify = new AccessModifiers();
		modify.b=10;
		modify.method3();
		System.out.println(modify.b);

	}

}
