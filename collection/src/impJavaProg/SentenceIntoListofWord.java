package impJavaProg;

import java.util.ArrayList;
import java.util.Scanner;

public class SentenceIntoListofWord {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string :");
		String str=sc.nextLine();
		
		String[] s= str.split(" ");
		ArrayList list=new ArrayList();
		for(String i:s)
		{
			list.add(i);
		}
        System.out.println(s);
	}

}
