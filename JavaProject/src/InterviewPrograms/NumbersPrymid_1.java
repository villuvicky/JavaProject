package InterviewPrograms;

import java.util.Scanner;

public class NumbersPrymid_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		k=sc.nextInt();
		sc.close();
		for (int i = 1; i <=k; i++) 
		{

			for (int j = 1; j<=k-i+1; j++) {
				System.out.print(j+"\t");
			}

			System.out.println();
		}
	}

}
