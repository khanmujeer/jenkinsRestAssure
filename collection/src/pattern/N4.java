package pattern;

public class N4 
{
	public static void main(String[] args)
	{ 
		int n=5;int k=0;
		// int k=1;
         for (int i = 0; i < n; i++) 
         {
			for (int j = 0; j < n; j++) 
			{
				System.out.print(k%9+1);
//				if(k==10)
//			         k=1;
//			   System.out.print(k%10);
			   k++;
			}
			System.out.println();
		 }
	}

}
