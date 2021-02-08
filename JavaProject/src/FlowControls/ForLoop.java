package FlowControls;

public class ForLoop {

	public static void forLoop() {
		
		
		{ 
	        int sum = 0; 
	  
	        // for loop begins 
	        // and runs till x <= 20 
	        for (int x = 1; x <= 20; x++) { 
	            sum = sum + x; 
	        } 
	        System.out.println("Sum: " + sum); 
	    } 
	}
	
	public static void forEach()
	
	{ 
        String array[] = {"Ron", "Harry", "Hermoine"};
        int array1[]= {1,2};
		
  
        //enhanced for loop 
        for (String x:array) 
        { 
            System.out.println(x); 
        } 
        for (int x:array1) 
        { 
            System.out.println(x); 
        } 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forLoop();
		forEach();
	}

}
