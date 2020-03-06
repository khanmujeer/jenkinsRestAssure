package impJavaProg;

import java.util.Scanner;

public class CommaBTWword {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.nextLine();
		String s="";
		
		for (int i = 0; i < str.length(); i++)
		{
			//s=s+str.charAt(i);
			//if(i<str.length()-1)
			//s=s+",";
			
			s=s+str.charAt(i) + ',';
		}
		s=s.substring(0,s.length()-1);
		System.out.println(s);

	}

}
