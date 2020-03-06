package impJavaProg;

import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
	    String s1="";
	    String s2="";
		
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				s1=s1+ch[i];
			}
			else
				s2=s2+ch[i];
		}
		String str2=s2+s1;
		System.out.println(str2);

	}

}
