package pattern;

public class N3 {

	public static void main(String[] args)
	{ 
		int n=5;
         for (int i = 0; i < n; i++) 
         {
			for (int j = 0; j < n; j++) 
			{
				if(i%2==0)
				    System.out.print(j%2);
				else
			        System.out.print(1-j%2);
			}
			System.out.println();
		 }
	}

}
