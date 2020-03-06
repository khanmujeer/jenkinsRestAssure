package arraylist;
import java.util.Scanner;
import java.util.ArrayList;

class Prime
{
	public static void main(String[] args) 
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number to check prime or not:");
		int n=in.nextInt();
        ArrayList<Integer> al= new ArrayList<>();
		for (int i=2;i<=n ;i++ )
		{
	       if(isPrime(i))
		   al.add(i);
		}
		System.out.println(al);
	}
	public static boolean isPrime(int num)
	{
	      for (int i=2;i<num ; i++)
          {
			      if(num%i==0)
			      {
					  return false;
				  }
		  }
		  return true;
	}
}