package impJavaProg;

import java.util.Scanner;

public class RemoveRepeatedChar {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.nextLine().toLowerCase();
		char[] ch1= str.toCharArray();
		char[] ch2= new char[ch1.length];
		ch2[0]=ch1[0];
		int k=1;
		
		for (int i = 1; i < ch1.length; i++) 
		{
			int j=0;
		    for ( ; j < k ; j++) 
		    {
				if(ch1[i]==ch2[j])
					break;
		    }
		    if(k==j)
		     ch2[k++]=ch1[i];
			
		}
		String str2= new String(ch2);
		System.out.println(str2);
		
		
	}

}
