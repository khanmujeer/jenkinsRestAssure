package impJavaProg;

import java.util.Scanner;

public class NumerictoWord
{
	static String[] a= {"", "one","two","three","four","five", "six","seven", "eight", "nine", "ten", 
			                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","eighteen","nineteen"};
	
	static String[] b= {"", "", "twenty","thirty", "forty", "fifty","sixty","seventy","eighty","ninety"};
	
	static void printNumber(int n, String word)
	{
		if(n>19)
			System.out.println(b[n/10] + " " + a[n%10] + " ");
		else
			System.out.println(a[n] + " ");
		if(n>0)
			System.out.println(word+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt();
		printNumber(n%100, "");
		
		

	}

}
