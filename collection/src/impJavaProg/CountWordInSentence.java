package impJavaProg;

import java.util.Scanner;

public class CountWordInSentence {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String sentence=sc.nextLine();
		char[] ch= sentence.toCharArray();
		int wc=0;
		for (int i = 0; i < ch.length-1; i++)
		{
			int sp=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int ep=i-1;
			if(sp<=ep)
			{
				wc++;
			}
		}
			System.out.println("There are "+wc+ " word");
		}	
	}


