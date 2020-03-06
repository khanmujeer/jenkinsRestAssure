package pattern;

public class P7 {

	public static void main(String[] args) {
		int n=4;
		for (int i = 0; i < 4; i++) 
		{
			int ch='e';
			for (int j = 0; j < n; j++,ch--) 
			{
				if(i<=j)
		      System.out.print((char)ch);
			}
			System.out.println();

	    }
	}

}
