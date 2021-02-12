package com.basic.java;

public class MethodOverload {
	
	//method name can be same but different data type or different counts in arguments should be used

	public void add(int a,int b) 
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(String Name) // same arguments but different data type
	{
		
		System.out.println(Name);
	}
	public void add(int a,int b,int c) // same method but count is different
	{
		 c=a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload load=new MethodOverload();
		
		load.add(2, 3);
		load.add("Hey Man");
		load.add(5, 7 ,0);
	}

}
