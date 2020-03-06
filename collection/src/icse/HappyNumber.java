package icse;

import java.util.Scanner;

public class HappyNumber 
{
	static int numSquareSum(int n)
	{
		int sqSum=0;
		while(n!=0)
		{
			int rem=n%10;
			sqSum+= rem*rem;
			n/=10;
		}	
		return sqSum;
	}
	static boolean isHappyNum(int n)
	{
		int slow,fast;
		slow=fast=n;
		do
		{
			slow=numSquareSum(slow);
			fast=numSquareSum(numSquareSum(fast));
		}
		while(slow!=fast);
		return (slow==1);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
         int n= new Scanner(System.in).nextInt();
         
		 if(isHappyNum(n))
			 System.out.println(n+" is a Happy number");
		 else
			 System.out.println(n+" is Not a Happy number");
	}

}
