package com.basic.java;

public class MethodOverload {

	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subtrct(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload load=new MethodOverload();
		load.add(5, 7);
		load.add(2, 3);
		load.subtrct(5, 7);
	}

}
