package impJavaProg;

import java.util.Scanner;

public class StringPalindrome1 {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
		//System.out.print("Enter a string :");
		//String str=sc.next();
		String str="madam";
		String rev="";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reversed string : "+rev);
		if(rev.equalsIgnoreCase(str))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not a Palindrome");
	}

}
