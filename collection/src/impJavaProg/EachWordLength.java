package impJavaProg;

public class EachWordLength {

	public static void main(String[] args)
	{ 
		String str="I love Java Program";
		String word="";
		str=str+" ";
		System.out.println("Word\tLength");
		System.out.println("------------------");
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i)!=' ')//word k bich me hai
			{
				word=word+str.charAt(i);
			}
			else//space aaya means ek word mil gya
			{
				System.out.println(word + "\t " + word.length());
			    word="";
			}
		}
	}
}
