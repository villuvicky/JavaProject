package com.basic.java;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte  b=127;// 8 bits -128 to +127
		
		System.out.println("Max Byte is "+Byte.MAX_VALUE);
		System.out.println("Min Byte is "+Byte.MIN_VALUE);
		
		short  s=2; // 2 bytes -32, 768 to 32, 767 
		
		System.out.println("Max Short is "+Short.MAX_VALUE);
		System.out.println("Min Byte is "+Short.MIN_VALUE);
		
		Integer k=2;  // 4 bytes  -2, 147, 483, 648 to 2, 147, 483, 647   0,
		
		System.out.println("Max integer is "+Integer.MAX_VALUE);
		System.out.println("Min integer is "+Integer.MIN_VALUE);
		
		//int is a primitive data type while Integer is a Wrapper class.
		
		int i=234; // -231 +232-1
		
		long l=5;   // 8 bytes  -263 +263-1 
		
		System.out.println("Max Long is "+Long.MAX_VALUE);
		System.out.println("Min Long is "+Long.MIN_VALUE);
		
		char c='l'; //2 bytes

		float f=2.5f;  // 4 bytes upto 7 decimal digits  1.4e-045 3.4e+38
		
		System.out.println("Max Float is "+Float.MAX_VALUE);
		System.out.println("Min Float is "+Float.MIN_VALUE);
		
		double d=2.2d;  //8 bytes upto 16 decimal digits 4.9e-324 1.8e+308
		
		System.out.println("Max Double is "+Double.MAX_VALUE);
		System.out.println("Min Double is "+Double.MIN_VALUE);
		
		boolean value = false; // default is false  1 bit
		
		System.out.println(b);
		
		//Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
		//Non-Primitive Data Type or Object Data type: such as String, Array, etc.
		
		b+=1; //it will overflow and prints -128

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);
		System.out.println(k);
		System.out.println(value);
		
		Double object =2.4; 
        int a = object.intValue(); 
        System.out.println(a);
        byte b1 = object.byteValue(); 
        System.out.println(b1);
        float d1 = object.floatValue(); 
        System.out.println(d1);
        double c1 = object.doubleValue(); 
        System.out.println(c1);
        System.out.println(a + b1 + c1 + d1 );
        
	}

}
