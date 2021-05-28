package InterviewPrograms;

public class StarPrymid {

	public static void triangle() {

		int n=5;

		for (int i=0; i<n; i++)
		{

			// inner loop to handle number spaces
			// values changing acc. to requirement
			for (int j=n-i; j>1; j--)
			{
				// printing spaces
				System.out.print(" ");
			}

			//  inner loop to handle number of columns
			//  values changing acc. to outer loop
			for (int j=0; j<=i; j++ )
			{
				// printing stars
				System.out.print(" *");
			}

			// ending line after each row
			System.out.println();
		}
	}

	public static void triangle1() {

		for(int i=0;i<=4;i++) {

			for(int j=0;j<=i;j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}

	}


	public static void triangle3() {

		for(int i=0;i<=4;i++) {

			for(int j=4;j>=i;j--) {

				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void triangle4() {
		
		for(int i=0;i<=4;i++) {

			for(int j=0;j<i;j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=4;i++) {

			for(int j=4;j>=i;j--) {

				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {


		System.out.println("**********Triangle 1**********"); 
		triangle();
		System.out.println("**********Triangle 2**********"); 
		triangle1();
		System.out.println("**********Triangle 3**********"); 
		triangle3();
		System.out.println("**********Triangle 4**********"); 
		triangle4();

	}
}


