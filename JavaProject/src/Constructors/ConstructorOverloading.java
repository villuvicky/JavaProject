package Constructors;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a,int b){
		int c=a+b;
		System.out.println(c);
		
	}
	ConstructorOverloading(String d,String e){
		
		System.out.println(d+" "+e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading constructor=new ConstructorOverloading(5, 2);
		System.out.println("values are overrided");
		ConstructorOverloading constructor2=new ConstructorOverloading(8, 1);
		System.out.println("method is overloaded");
		ConstructorOverloading constructor3=new ConstructorOverloading("Hi", "There");
	}

}
