package testYantra;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n=5;
//		int c=4;
//		char c='A';
		int k=65;
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(i>=j) 
				{
				System.out.print((char)k);
				
				}
				
				else
					System.out.print(" ");
				k++;
			}
			
			System.out.println();
		}

	}

}
