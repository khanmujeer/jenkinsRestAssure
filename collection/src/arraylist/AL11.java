package arraylist;

import java.util.ArrayList;

/* 1. read an integer from the user until he say stop
 * 2. find the summation of those integer numbers
 * note: All the number entered by user must be stored in a collection
 * 
 */

import java.util.Scanner;

public class AL11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s= new Scanner(System.in);
       boolean stop= false;
       ArrayList<Integer> num= new ArrayList<>();
       do {
    	   System.out.println("1Enter the number");
    	   int temp= s.nextInt();
    	   num.add(temp);
    	   System.out.println("enter 1 to continue");
    	   System.out.println("enter 2 to stop");
    	   
    	   int choice= s.nextInt();
    	   switch(choice)
    	   {
    	   case 1: break;
    	   case 2: stop=true;
    	           break;
    	           
    	   }
       } while(!stop);
       System.out.println(num);
       // sum of all number
       int sum=0;
       for(int i=0; i<num.size(); i++)
       {
    	   sum=sum+num.get(i);
       }
       System.out.println("sum is "+sum);
	}

}
