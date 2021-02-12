 package com.basic.java;

public class FinalKeyword {


	static void FinalVariable() {

		final int i=5;

		// i=10; it cannot be done as it is final variable

		final StringBuffer s = new StringBuffer("Hey");

		s.append(" Man");

		System.out.println(s);

	}

	static void finalMethod()
	{
		int arr[] = {1, 2, 3}; 

		// final with for-each statement 
		// legal statement 
		for (final int i : arr) 
			System.out.print(i + " "); 
		
		/*Since the i variable goes out of scope with each iteration of the loop, 
		it is actually re-declaration each iteration, allowing the same token (i.e. i) to be used to represent multiple variables.*/


	}     






	public static void main(String[] args) {

		//When a variable is declared with final keyword, its value can’t be modified, essentially, a constant.

		FinalVariable();
		finalMethod();
	}

}
