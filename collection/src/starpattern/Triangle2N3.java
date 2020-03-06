package starpattern;

public class Triangle2N3 {

	public static void main(String[] args) 
	{
           for (int i = 1; i <= 5; i++) 
           { 
			   for (int j = 5; j >=i; j--) 
			      System.out.print("*");
			
			System.out.println();
		   }
 
           System.out.println("--------------");
           
           for (int i = 1; i <= 5; i++) 
           {
        	  for (int j = 2; j <= i; j++)//
        	     System.out.print(" ");
			   
			   for (int j = 5; j >=i; j--) 
			      System.out.print("*");
			
			System.out.println();
		   }
	}

}
