package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AL16 {
	
	// read method
	static Collection<Integer> read()
	{
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> num= new ArrayList<>();
		boolean stop= false;
		do {
			System.out.println("Enter a number");
			num.add(s.nextInt());
			System.out.println("1. to continue");
			System.out.println("2. to stop");
			
			switch(s.nextInt())
			{
			case 1: break;
			case 2: stop=true;
			            break;
			            
			}
		} while (!stop);
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println(sum);
	}
        //sum method
	       static int sum(Collection<Integer> c)
	       {
	    	   int sum=0;
	    	   ArrayList<Integer> ls= new ArrayList<>();// downcast ls to c
	    	   for(int i=0;i=ls.size();i++)
	    	   {
	    		   sum=sum+ls.get(i);
	    	   } return sum;
	       }
}
