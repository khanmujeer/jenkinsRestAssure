package pattern;

public class N1 {

	public static void main(String[] args) 
	{
		int c=0;
           for (int i = 1; i <= 5; i++)
           {
        	   if(i%2!=0)//odd
        	   {
        		   for (int j = 1; j <= 3; j++) 
        		   {
        			   c++;
					  System.out.print(c+" ");
				   }
        	   }
        	   else //even
        	   { 
        		   int t=c+1;
        		   for (int j = c+3; j >=t; j--) 
        		   {
        			   c++;
					   System.out.print(j+" ");
				   }
        	   }
        	   System.out.println();
		   }
	}

}
