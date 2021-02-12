package com.inheritance.java;

public class OverRideChild extends OverRideParent{

	public void Task() {

		System.out.println("From Child task");
	}

	public static void main(String[] args) {
		
		OverRideChild child = new OverRideChild();
		
		child.Task(); // since it is present on both classes child will take it from child and overridden
		
		child.Process(); // since it is present only on parent so parent method will be called

	}

}
