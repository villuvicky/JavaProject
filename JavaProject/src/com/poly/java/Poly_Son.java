package com.poly.java;

public class Poly_Son extends Poly_Parent{

	@Override
	public void marraige() {
		System.out.println("I won't marry her");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly_Parent Son= new Poly_Son();
		Son.properties();
		Son.marraige();
		
		}

}
