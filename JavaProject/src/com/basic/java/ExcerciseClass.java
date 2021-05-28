package com.basic.java;

import java.util.Scanner;

public class ExcerciseClass {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int date=10;
		String xpath="//div[text()="+"\""+date+"\""+"]"+"//parent::div";
		System.out.println(xpath);
		
		while(true) {
			
			if(date>13)
			{
				
				System.out.println("pass");
				break;
				
			}
			
			else{
				
				date++;
				System.out.println(date);
				
			}
			
			
		}
	}

}
