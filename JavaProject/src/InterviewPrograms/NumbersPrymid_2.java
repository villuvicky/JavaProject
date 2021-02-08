package InterviewPrograms;

import java.util.Scanner;

public class NumbersPrymid_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		//int p=1; // to print k times in sequence of numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		k=sc.nextInt();
		sc.close();
		for (int i = 1; i <=k; i++) 
		{
			int p=1; //  to print same numbers k times

			for (int j = 0; j<i; j++) {
				System.out.print(p+"\t");
				p++;
			}
			
			System.out.println();
		}
	}

}
