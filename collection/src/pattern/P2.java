package pattern;

public class P2 {
public static void main(String[] args) {
	
	int r=4,c=4;
	
	for (int i = 0; i < r; i++) 
	{
		int k=1;
		char ch='a';
		
		for (int j = 0; j < c; j++) 
		{
			if(i%2==0)
			System.out.print(k++ + " ");
			else
				System.out.print(ch++ + " ");
		}
		System.out.println();
	}
}
}
