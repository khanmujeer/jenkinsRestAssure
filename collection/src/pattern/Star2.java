package pattern;

public class Star2 
{
   /**
 * @param args
 */
public static void main(String[] args) {
	   int n=7;
	   
	   for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(i>=j&& i+j>=n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	    }

	     n=5;
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(i<=j&& i+j<=n-1)
				     System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
	    }
		
		}
}
