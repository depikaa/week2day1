package week2.day1;

public class FreqOfNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int count=0;
	String str="welcome to chennai";
	char[] charArray = str .toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		if(charArray[i]=='e')
		{
			count =count+1;
		}
		System.out.println("the count of e:"+ count);
	}
		}
	


	}


