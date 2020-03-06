package starpattern;

public class Pyramid {

	public static void main(String[] args) 
	{
		for (int i = 1; i <=5 ; i++)  // 5 rows
        {
			for (int j = 5; j >i; j--) // ----,---,--,-,false 
			   System.out.print(" ");
			for (int k = 1; k <i*2; k++) //1,123,12345,1234567,123456789 
				   System.out.print(k);
				
		 System.out.println();
		}
		
		System.out.println("-----change i loop------");
		
		for (int i = 5; i >=1 ; i--)  
        {
			for (int j = 5; j >i; j--) // false,-,--,---,---- 
			   System.out.print(" ");
			for (int k = 1; k <i*2; k++) //123456789,1234567,12345,123,1 
				   System.out.print(k);

		   System.out.println();
		   }

	}

}
