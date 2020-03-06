package testYantra;

import java.util.Scanner;

public class StringPalindrome {

	public static String reverseTheString(String str)
	{
		String rev=" ";
		for (int i = 0; i < str.length(); i++) 
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str= sc.nextLine();
		String revStr= reverseTheString(str);
		if(str.equals(revStr))
			System.out.println("Palindrome");
	

	}

}
