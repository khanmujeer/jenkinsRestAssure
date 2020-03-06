package pattern;

public class Star1 
{
   public static void main(String[] args) {
	   int n=5,k=0;
	   
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j <n; j++) 
			{
				if(i>=j)
				{
			    System.out.print(j%2);
				}
			}
			System.out.println();

	    }
}
}
