package pattern;

public class Diamond1 {
	public static void main(String[] args) {
		int i, j, n = 9, k = 1, sp = n / 2;

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= sp; j++) 
				System.out.print("-");

			for (j = 1; j <= k; j++) 
				System.out.print("*");

			System.out.println();
			
			if (i <= n / 2) 
			{
				sp--;
				k = k + 2;
			} 
			else 
			{
				sp++;
				k = k - 2;
			}
		}
	}
}
