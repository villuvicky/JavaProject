package InterviewQuestions;

public class PalindromeReverse {


	public static void ByString() {

		String name= "malayalam";
		String Reversed="";

		for(int i=name.length()-1;i>=0;i--)  // -1 since it starts from 0
		{

			Reversed= Reversed+name.charAt(i); // + operator to add two strings

		}
		if(name.equals(Reversed))
		{
			System.out.println("It's palindrome");
		}
	}

	public static void ByStringBuilder(){

		{
			String input = "Geeks for Geeks";

			StringBuilder input1 = new StringBuilder();

			// append a string into StringBuilder input1
			input1.append(input);

			// reverse StringBuilder input1
			input1.reverse();

			// print reversed String
			System.out.println(input1);
		}
	}
	
	public static void ReverseNumber() {
		
		int num=524;
		int rev_num = 0; 
        while(num > 0) 
        { 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        System.out.println(rev_num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByString();
		ByStringBuilder();
		ReverseNumber();
	}

}
