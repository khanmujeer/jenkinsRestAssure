package impJavaProg;

import java.util.Arrays;

public class Anagram2
{
	public static void main(String[] args) 
	{
          String str1="Hitler Woman" ;
          String str2="Mother In Law";
          char[] ch1 = str1.replaceAll(" ", "").trim().toLowerCase().toCharArray();
          char[] ch2 = str2.replaceAll(" ", "").trim().toLowerCase().toCharArray();
          
          Arrays.sort(ch1);
          Arrays.sort(ch2);
         System.out.println(ch1);
         System.out.println(ch2);
         boolean IsAnagram = Arrays.equals(ch1, ch2);
         
         if(IsAnagram)
        	 System.out.println("Anagram");
         else
        	 System.out.println("Not an anagram");
	}

}
