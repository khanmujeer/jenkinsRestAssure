package pattern;

public class P1 {

	public static void main(String[] args) {
 
		int r=4,c=4;
		int k=1;
		char ch='a';
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) 
			{
				if(i%2==0)
				System.out.print(ch++);
				else
					System.out.print(k++);
			}
			System.out.println();
			
		}

	}

}
