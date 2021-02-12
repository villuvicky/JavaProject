package com.collection.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BasicArray {

	/*
	 * Any group of individual objects which are represented as a single unit is known as the collection of the objects. 
	 * In Java, a separate framework named the “Collection Framework” has been defined in JDK 1.2 which holds 
	 * all the collection classes and interface in it.
	 * */


	public static void SimpleArray() {

		int a[]= new int [2];
		a[0]=1;
		a[1]=3;
		int b[]={1,2};
		int c[]=new int []{1,2};

		for (int i : a) {
			System.out.println(i);
		}


	}

	public static void TwoDArray() {
		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;


		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j<a.length+1; j++) {
				System.out.println(a[i][j]);
			}
		}
	}
	public static void MinMax() {
		
		 Integer[] num = { 2, 4, 7, 5, 0 };
		 int  k=num[0];
		 
		 for (int i = 0; i < num.length; i++) 
		 {
			 if(num[i]<k) 
			 {
				k=num[i];
				System.out.println("The Minimum is "+k);
				 
			 }
		}
		
		 int minumum =  Collections.min(Arrays.asList(num)); // it has to be integer class
		 int maximum= Collections.max(Arrays.asList(num));
		 
		 System.out.println("The Minimum is "+minumum+ " The Maximum is "+maximum);
		 
		 
	}
	
	public static void MaxInRow() 
	{
		
		 Integer[][] arrays = { {2,3,2},{43,-5,7},{1,151,2}};
		 int minimum=arrays[0][0];
		 int column=0;
		 System.out.println(arrays.length);
		 
		 for (int i = 0; i < arrays.length; i++) {
			
			 for (int j = 0; j <arrays.length; j++) {
				 
				if(arrays[i][j]<minimum) {
					minimum= arrays[i][j];
					column=j;
					
				}
			}
		}
		 System.out.println("Minimum value column is "+column+" "+minimum);
		
		 int p=0;
		 int max=arrays[p][column];
		 while(p<arrays.length)
		 {
			if(arrays[p][column]>max)
			{
				max=arrays[p][column];
				
			}
			p++;
		 }
		 System.out.println("Maximum value is "+max);
 }
		 
	
	public static void main(String[] args) {

		SimpleArray();
		TwoDArray();
		MinMax();
		MaxInRow();
	}

}
