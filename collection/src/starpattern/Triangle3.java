package starpattern;

public class Triangle3 {

	public static void main(String[] args) 
	{
           for (int i = 1; i <= 5; i++) 
           {
			 for (int j = 5; j >=i; j--) // 54321,i=2 5432,i=3 543
			    System.out.print("*");
			
			System.out.println();
		   }
	}

}
