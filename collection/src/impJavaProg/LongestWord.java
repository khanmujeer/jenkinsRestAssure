package impJavaProg;

public class LongestWord {

	public static void main(String[] args)
	{ 
		String str="I love Programming";
		String word="";
		String longestWord="";
		str=str+" ";
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)!=' ')
			{
				word=word+str.charAt(i);
			}
			else//space aaya means ek word mil gya
			{
				if(word.length()>longestWord.length())
				{
					longestWord=word;
				}
				word="";//reset khali kro
			}
		}
		System.out.println(longestWord);
				

	}

}
