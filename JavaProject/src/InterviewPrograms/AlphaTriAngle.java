package InterviewPrograms;

public class AlphaTriAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=65;
		int b=97;

		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
				
			{
				System.out.print((char)(a+j)+" ");
				
			}
			System.out.println();
		}
		

		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
				
			{
				System.out.print((char)(a)+" ");
				
			}
			a++;
			System.out.println();
		}
		
	}

}
