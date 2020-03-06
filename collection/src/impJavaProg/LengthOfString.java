package impJavaProg;

public class LengthOfString {

	public static void main(String[] args) 
	{
		String s="selenium";
		char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) 
		{
			count++;
		}
		System.out.println(count);
		
		System.out.println(s.lastIndexOf(""));

	}

}
