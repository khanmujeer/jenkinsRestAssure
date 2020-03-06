package impJavaProg;

public class Anagram
{
	public static void main(String[] args) 
	{
          String str1="silent" ;
          String str2="listen";
          char[] ch1 = str1.toCharArray();
          char[] ch2 = str2.toCharArray();
          char[] sc1 = Sort(ch1);
          String ss1 = String.valueOf(sc1);
          System.out.println(ss1);
          char[] sc2 = Sort(ch2);
          String ss2 = String.valueOf(sc2);
          System.out.println(ss2);
          
          if(ss1.equals(ss2))
        	  System.out.println("Anagram");
          else
        	  System.out.println("Not Anagram");
          
	}
	public static char[] Sort(char ch[])
	{
		for (int i = 0; i < ch.length-1; i++) 
        {
			for (int j = 0; j < ch.length-i-1; j++)
			{
				if(ch[j]>ch[j+1])
				{
					char temp = ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;	
				}		
			}
		  }
		return ch;
	}

}
