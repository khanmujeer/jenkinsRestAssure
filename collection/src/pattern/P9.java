package pattern;

public class P9 
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i = 0; i < n; i++) 
		{
			int k=5;
			for (int j = 0; j < n; j++) 
			{
				if(i+j<=n-1&& i>=j)
		      System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

	    }
	}

}
