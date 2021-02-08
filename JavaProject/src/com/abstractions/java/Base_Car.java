package com.abstractions.java;

public abstract class Base_Car {

	public void vehicle () {
		
		System.out.println("It is a car");
		
	}
	
	public abstract void  engine_type() ; // abstract methods cannot have body

	public  void car_type() // methods can have body and should not be private
	
	{
		System.out.println("i am BMV engine type");
	}
	public void partsOfCar() {
		
		System.out.println("I will not be called as I am neither called nor implemented");
	}
}
