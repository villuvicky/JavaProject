package com.abstractions.java;

public interface Parts {

	/*Like a class, an interface can have methods and variables,
	 *but the methods declared in an interface are by default abstract (only method signature, no body).  */
	
	public String value="Hey parts are here";  
	// variables from interface should be public
	
	String value2="Hey genuine parts are here";  
	// by default it will be public
	
	public String method1(); 
	//methods defined here should not have body in it
	
	public void method2();
	//only public, private, abstract, default, static and strict are permitted

}
