package week2.day1;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String types = "&& Welcometo 2nd Class of Automation 2021 &&";
		
		int letter=0,number=0,space=0,specialcharacter=0;
		char[] charArr=types.toCharArray();
		
		for(int i=0; i<charArr.length;i++) {
			if (Character.isDigit(charArr[i])) {
				number++;
			} else if (Character.isLetter(charArr[i])) {
				letter++;
			} else if (Character.isSpace(charArr[i])) {
				space++;
			} else
				specialcharacter++;
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("specialCharcter (&&) : " + specialcharacter);	
		}
	
}

