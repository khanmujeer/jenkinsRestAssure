package impJavaProg;

import java.util.Scanner;

public class PrintEachWordLength {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int wc=0;
		
		for (int i = 0; i < ch.length; i++) 
		{
			int sp=i;
			while ( i<ch.length && ch[i]!=' ') 
			{
				i++;
			}
			int ep=i-1;
			if(sp<=ep)
			{
				wc++;
				for (int j = sp; j <= ep; j++) 
				{
				System.out.print(ch[j]);	
				}
				System.out.println(":length="+(ep-sp+1));
			}	
		}

	}

}
