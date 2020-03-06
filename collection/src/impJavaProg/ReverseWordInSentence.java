package impJavaProg;

import java.util.Scanner;

public class ReverseWordInSentence {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String rev="";
		
		for (int i = 0; i < ch.length; i++) {
			
			int sp=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int ep=i-1;
			if(sp<=ep)
			{
				String wrev="";
		
				for (int j = sp; j <= ep; j++)
				{
					wrev=ch[j]+wrev;	
				}
				rev=rev+wrev+' ';
			}
		}
		System.out.println(rev);

	}

}
