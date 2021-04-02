package InterviewPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AadharCard {


	public static boolean isValidAadharNumber(String str)
	{
		// Regex to check valid Aadhar number.
		String regex
		= "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";

		/* Where: 
        	^ represents the starting of the string.
        	[2-9]{1} represents the first digit should be any from 2-9.
        	[0-9]{3} represents the next 3 digits after the first digit should be any digit from 0-9.
        	\\s represents white space.
        	[0-9]{4} represents the next 4 digits should be any from 0-9.
        	\\s represents white space.
        	[0-9]{4} represents the next 4 digits should be any from 0-9.
        	$ represents the ending of the string.*/

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the string is empty
		// return false
		if (str == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given string
		// and regular expression.
		Matcher m = p.matcher(str);

		// Return if the string
		// matched the ReGex
		return m.matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "3675 9834 6015";
		System.out.println(isValidAadharNumber(str1));

		// Test Case 2:
		String str2 = "4675 9834 6012 8";
		System.out.println(isValidAadharNumber(str2));

		// Test Case 3:
		String str3 = "0175 9834 6012";
		System.out.println(isValidAadharNumber(str3));

		// Test Case 4:
		String str4 = "3675 98AF 60#2";
		System.out.println(isValidAadharNumber(str4));

		// Test Case 5:
		String str5 = "417598346012";
		System.out.println(isValidAadharNumber(str5));
	}

}
