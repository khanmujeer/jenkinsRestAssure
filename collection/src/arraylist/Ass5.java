package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ass5 {

	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++) 
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	/*public static ArrayList<Integer> series(int term)
	{ 
		ArrayList<Integer> list= new ArrayList<>();
		int count=0;
		for (int i = 2; i < 100 ; i++) 
		{	
			if(isPrime(i))
			{
		      list.add(i*i);
		      count++;
			}
			if (count==5)
				break;
		}
		System.out.println(list);
		System.out.println(count);
	}
	*/
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the term");
		int term=s.nextInt();
		
		ArrayList<Integer> list= new ArrayList<>();
		int count=0;
		for (int i = 2; i < 100 ; i++) 
		{	
			if(isPrime(i))
			{
			  int sq=i*i;
			  list.add(sq);
		      count++;
			}
			if (count==term)
				break;
		}
		System.out.println("list:"+list);
		
		/*ArrayList<Integer> newlist= new ArrayList<>();
	    
		for(int j=0; j<list.size();j++)
		{
			if (list.get(j)%10==0)
			{
				newlist.add(j);	
		    }
	     System.out.println("New list:" +newlist);
		}*/
	}
}
