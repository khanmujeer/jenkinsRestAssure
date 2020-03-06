package starpattern;

public class Triangle {

	public static void main(String[] args) 
	{
		int n=5;
        for (int i = 1; i <= n ; i++)
        {
			for (int j = 1; j <= n; j++) 
			{
				if(i==j||i+j==n+1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
		  System.out.println();
		}
        
        System.out.println("----Pattern 2-----");
        
        for (int i = 1; i <= n ; i++)
        {
			for (int j = 1; j <= n; j++) 
			{
				if(i<=j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
		  System.out.println();
		}
        
        System.out.println("----Pattern 3-----");
        
        for (int i = 1; i <= n ; i++)
        {
			for (int j = 1; j <= n; j++) 
			{
				if(i+j<=n+1)
				   System.out.print("*");
				else
				   System.out.print(" ");
			}
		  System.out.println();
		}
        
        System.out.println("----Pattern 4-----");
        
        for (int i = 1; i <= n ; i++)
        {
			for (int j = 1; j <= n; j++) 
			{
				if(i+j>=n+1)
				   System.out.print("*");
				else
				   System.out.print(" ");
			}
		  System.out.println();
		}
        
	}

}
