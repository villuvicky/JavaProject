package com.basic.java;

public class Constructortypes {
	String Value;
	int num;
	 Constructortypes(){  //no argument constructor
		System.out.println("I have no values in me passed from object");

	}
	Constructortypes(String values){ // arguments constructor
		System.out.println("u passed "+values+" here");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructortypes constructortypes=new Constructortypes();
		System.out.println(constructortypes.Value);//String is a class so value is null and called by default constructor
		System.out.println(constructortypes.num);//num is a class so value is null
		Constructortypes constructortypes1=new Constructortypes("Constructor");


	}

}
