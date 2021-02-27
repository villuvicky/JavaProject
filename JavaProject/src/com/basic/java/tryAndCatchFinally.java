
package com.basic.java;

public class tryAndCatchFinally {
	
	public static void m1() {
	int[] arr = new int[4]; 
    
    try
    { 
        @SuppressWarnings("unused")
		int i = arr[4];
      //  System.out.println(i);
              
        // this statement will never execute 
        // as exception is raised by above statement 
        System.out.println("Inside try block"); 
    } 
      
    catch(ArrayIndexOutOfBoundsException ex) 
    { 
        System.out.println("Exception caught in catch block"); 
    } 
      
    finally  //it will be printed even the script fails and throws exception  to delete cookies , close browser if jvm stops then finally will not run
    { 
        System.out.println("finally block executed"); 
    } 
      
    // rest program will be executed 
    System.out.println("Outside try-catch-finally clause"); 

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      
        // array of size 4. 
        m1();

}
}