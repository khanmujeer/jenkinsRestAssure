package numberImpProg;

import java.util.Scanner;

public class N1 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 3 number");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         
         if(a+b==c)
        	 System.out.println("True");
         else
        	 System.out.println("False");
         
         
	} 

}
