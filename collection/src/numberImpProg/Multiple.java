package numberImpProg;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) 
	{
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Number");
          int n=sc.nextInt();
          
          for (int i = 1; i <=5; i++)
          {
			System.out.println(n*i);
		  }
	}

}
