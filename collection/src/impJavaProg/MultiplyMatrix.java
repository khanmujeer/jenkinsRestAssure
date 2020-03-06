package impJavaProg;

public class MultiplyMatrix {

	public static void main(String[] args) {
		
		int a[][]= {{1,1,1},
				    {2,2,2},
				    {3,3,3}};
		
		int b[][]= {{1,1,1},
				    {2,2,2},
				    {3,3,3}};
		
		int c[][]= new int[a.length][b[0].length];
		
		if(a[0].length==b.length) 
		{
			for (int i = 0; i < c.length; i++) 
			{
				for (int j = 0; j < c.length; j++) 
				{
				    c[i][j]=0;
				    for (int k = 0; k < c.length; k++)
				    {
						c[i][j]= c[i][j]+a[i][k]*b[k][j];
					}
				    System.out.print(c[i][j]+" ");
				}
				System.out.println();
				
			}
		}

	}

}
