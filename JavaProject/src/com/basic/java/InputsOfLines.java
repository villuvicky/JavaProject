package com.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputsOfLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	      //Enter data using BufferReader 
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name); 
        
        
        Scanner in = new Scanner(System.in); 
        
        String s = in.nextLine(); 
        System.out.println("You entered string "+s); 
  
        int a = in.nextInt(); 
        System.out.println("You entered integer "+a); 
        
        in.close();
        
        String Text = System.console().readLine(); 
        
        System.out.println(Text); 
        
        int a1 = 20, b = 10, c = 30, result;
        
        // result holds max of three
        // numbers
        result = ((a1 > b) ? (a1 > c) ? a1 : c: (b > c)  ? b  : c);
        System.out.println("Max of three numbers = "
                           + result);
        
        
	}

}
