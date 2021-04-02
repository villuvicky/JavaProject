package Threads;

public class ThreadLocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal<Number> gfg_local = new ThreadLocal<Number>(); 
		  
        ThreadLocal<String> gfg = new ThreadLocal<String>(); 
  
        // setting the value 
        gfg_local.set(100); 
  
        // returns the current thread's value 
        System.out.println("value = " + gfg_local.get()); 
  
        // setting the value 
        gfg_local.set(90); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg_local.get()); 
  
        // setting the value 
        gfg_local.set(88.45); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg_local.get()); 
  
        // setting the value 
        gfg.set("GeeksforGeeks"); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg.get()); 
  
        // removing value 
        gfg.remove(); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg.get()); 
  
        // removing vale 
        gfg_local.remove(); 
  
        // returns the current thread's value of 
        System.out.println("value = " + gfg_local.get()); 
  
	}

}
