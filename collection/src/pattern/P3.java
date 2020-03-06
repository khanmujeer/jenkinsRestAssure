package pattern;

public class P3 
{
 public static void main(String[] args) {
	
	 int r=4,c=4;
	 String s="java";
		
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < c; j++) 
			{
				if(i%2==0)
				System.out.print(s.charAt(j));
				else
					System.out.print(s.charAt(s.length()-1-j));
			
			}
			System.out.println();
		}
}

}
