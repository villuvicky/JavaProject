package FlowControls;

public class ifClass {



	public static void onlyIf() {
		{ 
			int i = 10; 

			if (i > 15) 
				System.out.println("10 is less than 15"); 

			// This statement will be executed 
			// as if considers one statement by default 
			System.out.println("I am Not in if"); 
		} 
	}

	public static void IfElse() {
		{ 
			int i = 10; 

			if (i < 15) 
				System.out.println("i is smaller than 15"); 
			else
				System.out.println("i is greater than 15"); 
		} 
	}

	public static void NestedIf() {
		{ 
			int i = 10; 

			if (i == 10) 
			{ 
				// First if statement 
				if (i < 15) 
					System.out.println("i is smaller than 15"); 

				// Nested - if statement 
				// Will only be executed if statement above 
				// it is true 
				if (i < 12) 
					System.out.println("i is smaller than 12 too"); 
				else
					System.out.println("i is greater than 15"); 
			} 
		} 
	}
	
	
	public static void IfElseLadder() {
		
		 { 
		        int i = 20; 
		  
		        if (i == 10) 
		            System.out.println("i is 10"); 
		        else if (i == 15) 
		            System.out.println("i is 15"); 
		        else if (i == 20) 
		            System.out.println("i is 20"); 
		        else
		            System.out.println("i is not present"); 
		    } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		onlyIf();
		IfElse();
		NestedIf();
		IfElseLadder();
		
	}

}
