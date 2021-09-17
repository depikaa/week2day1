package week2.day1;

public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strg = "Madam";
		String rev = "";

		System.out.println("The given string is : " +strg);
		for (int i = strg.length()- 1; i >= 0; i--) {
			rev = rev+ strg.charAt(i);
			
		}
		System.out.println("The string after reversing: " +rev);
		if (strg.equalsIgnoreCase(rev)) {
			System.out.println(" Palindrome");
		} else
			System.out.println("Not a palindrome");

	}


	}


