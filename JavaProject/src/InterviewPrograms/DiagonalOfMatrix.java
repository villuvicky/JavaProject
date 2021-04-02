package InterviewPrograms;

import java.util.Scanner;

public class DiagonalOfMatrix {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[][] = new int [n][n];
		    for(int i=0;i<n;i++){
		        for(int j=0;j<n;j++){
		        arr[i][j] = sc.nextInt();
		        }
		    }
	        int sum1 = 0, sum2 = 0;
	        for(int i=0;i<n;i++){
	            sum1+=arr[i][i];
	            sum2+=arr[i][n-i-1];
	        }
	        int ans = Math.abs(sum1-sum2);
	        System.out.println(ans);
	    }

}
