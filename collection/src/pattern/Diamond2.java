package pattern;

public class Diamond2 
{
	public static void main(String[] args) 
	{
       int i,j,n=9,sp=n/2;
       
       for (i = 1; i <= n; i+=2) // 1,3,5,7,9
       { 
    	   for (sp = n; sp >i; sp--) // ----, ---, --,-,0
    	        System.out.print(" ");
		   for ( j = 1; j <=i; j++) // 1,123,12345,1234567,123456789 
			     System.out.print("*");
	    //sp--;
        System.out.println();
       }
//       sp=sp+2;
//       for (i = n-2; i >=1; i-=2) 
//       { 
//    	   for (j = 1; j <= sp; j++) 
//    	        System.out.print(" ");
//		   for ( j = 1; j <=i; j++) 
//			     System.out.print("*");
//	   sp++;
//       System.out.println();
//       }

       }}
