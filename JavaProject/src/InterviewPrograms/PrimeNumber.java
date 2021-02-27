package InterviewPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean prime(int p) {

		if(p<=1)

			return false;

		else if (p == 2)

			return true;

		for(int i=3;i<p;i++)

			if(p%i==0) 
				return false;

		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		sc.close();


		if(prime(p))

			System.out.println("True");

		else
			System.out.println("False");
	}

}
