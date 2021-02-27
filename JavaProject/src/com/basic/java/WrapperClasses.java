package com.basic.java;

public class WrapperClasses {

	/*
	 * A Wrapper class is a class whose object wraps or contains primitive data types.
	 * They convert primitive data types into objects. 
	 * Objects are needed if we wish to modify the arguments passed into a method (because primitive types are passed by value).
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//  byte data type 
        byte a = 1; 
  
        // wrapping around Byte object 
        Byte byteobj = a; 
  
        // int data type 
        int b = 10; 
  
        //wrapping around Integer object 
        Integer intobj =b; 
  
        // float data type 
        float c = 18.6f; 
  
        // wrapping around Float object 
        Float floatobj = c; 
  
        // double data type 
        double d = 250.5; 
  
        // Wrapping around Double object 
        Double doubleobj = d; 
  
        // char data type 
        char e='a'; 
  
        // wrapping around Character object 
        Character charobj=e; 
  
        //  printing the values from objects 
        System.out.println("Values of Wrapper objects (printing as objects)"); 
        System.out.println("Byte object byteobj:  " + byteobj); 
        System.out.println("Integer object intobj:  " + intobj); 
        System.out.println("Float object floatobj:  " + floatobj); 
        System.out.println("Double object doubleobj:  " + doubleobj); 
        System.out.println("Character object charobj:  " + charobj); 
  
        // objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types 
        byte bv = byteobj; 
        int iv = intobj; 
        float fv = floatobj; 
        double dv = doubleobj; 
        char cv = charobj; 
  
        // printing the values from data types 
        System.out.println("Unwrapped values (printing as data types)"); 
        System.out.println("byte value, bv: " + bv); 
        System.out.println("int value, iv: " + iv); 
        System.out.println("float value, fv: " + fv); 
        System.out.println("double value, dv: " + dv); 
        System.out.println("char value, cv: " + cv); 
	}

}
