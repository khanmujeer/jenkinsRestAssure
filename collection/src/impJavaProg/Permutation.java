package impJavaProg;

import java.util.Scanner;

public class Permutation {
	
	public static int fact(int n) 
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String word=sc.nextLine();
		int n=word.length();
		System.out.println(fact(n));
		

	}

}
