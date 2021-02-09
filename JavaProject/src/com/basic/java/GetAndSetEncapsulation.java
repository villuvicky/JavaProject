package com.basic.java;

public class GetAndSetEncapsulation {

	private  int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		GetAndSetEncapsulation object1 = new GetAndSetEncapsulation();
		object1.setAge(23);
		object1.setName("Vicky");
		System.out.println("My age is "+object1.getAge());
		System.out.println("My Name is "+object1.getName());
	}

}
