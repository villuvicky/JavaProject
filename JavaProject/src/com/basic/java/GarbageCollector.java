package com.basic.java;

public class GarbageCollector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GarbageCollector U1 = new GarbageCollector(); 
		GarbageCollector U2 = new GarbageCollector(); 
          
        // Nullifying the reference variable 
		U1 = null; 
        
        // requesting JVM for running Garbage Collector 
		Runtime.getRuntime().gc();
		  Thread.sleep(1000);
        // Nullifying the reference variable 
		U2 = null; 
          
        // requesting JVM for running Garbage Collector 
		Runtime.getRuntime().gc();
		  Thread.sleep(1000);
	}
	 @Override
	    // finalize method is called on object once  
	    // before garbage collecting it 
	    protected void finalize() throws Throwable 
	    { 
	        System.out.println("Garbage collector called"); 
	        System.out.println("Object garbage collected : " + this); 
	    }

}
