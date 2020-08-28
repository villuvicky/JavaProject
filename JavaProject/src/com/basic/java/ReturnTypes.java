package com.basic.java;

public class ReturnTypes {
	
	
	public  int ReturnAmount() {
		int amount=2000;
		System.out.println("came here to collect amount and returning it to main method");
		return amount;//returning the variable to main method

	}
	public static void main(String[] args) {
		
		ReturnTypes types= new ReturnTypes();
		
		int returned_amount=types.ReturnAmount();
		//calling the method with object an storing in the return type
		
		System.out.println("Amount is received from method and giving it here "+returned_amount);
	}

}
