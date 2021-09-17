package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "stops";
		String str1 = "potss";
		
		int length = str.length();
		int length1 = str1.length();
		
		if (length == length1)
		{
			char[] chastr = str.toCharArray();
			char[] chastr1 = str1.toCharArray();
			
				Arrays.sort(chastr);
				Arrays.sort(chastr1);
		
				if (Arrays.equals(chastr, chastr1))
					System.out.println(str+ " is an Anagram of " +str1);
				else
					System.out.println(str+ " is not an Anagram of " +str1);
					
		}
		
	}
}
