package pattern;

public class P10 {

	public static void main(String[] args) {
 
		int n=5;
		for (int i = 1; i <=n; i++) // 5 row-12345
		{
			for (int j = 5; j >=i; j--) //
				System.out.print("* ");
			
		 System.out.println();		
		}
	}
}
