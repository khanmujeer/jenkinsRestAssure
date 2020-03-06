package impJavaProg;

import java.util.Scanner;

public class StringPalindrome2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.next();
        String rev="";
		
		for (int i = str.length()-1; i >=0; i--)
		{	
			rev=rev+str.charAt(i);	
		}
		System.out.println(rev.equalsIgnoreCase(str)? "Palindrome":"Not a Palindrome");
		
	}

}
