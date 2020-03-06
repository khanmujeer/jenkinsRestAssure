package pattern;

public class Diamond 
{
	public static void main(String[] args) 
	{
       int n=31;
       int sp=n/2;
       
       for (int i = 1; i <= n; i+=2) 
       { 
    	   for (int j = 1; j <= sp; j++) 
    		    System.out.print("  ");
		   for (int k = 1; k <=i; k++) 
			   System.out.print("* ");
			     
		System.out.println();
		sp--;
	   }//sp=-1
       
       sp+=2; //-1+2=1
       for (int i = n-2; i >= 1; i-=2) 
       { 
    	   for (int j = 1; j <= sp; j++) 
    		    System.out.print("  ");
		   for (int j = 1; j <=i; j++)  
			   System.out.print("* ");
			     
		System.out.println();
		sp++;
	   }    
}}
