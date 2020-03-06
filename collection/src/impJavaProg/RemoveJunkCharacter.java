package impJavaProg;

public class RemoveJunkCharacter 
{
   public static void main(String[] args) 
   {
	  String str= "Rs.123.00 ";
	 
	  // Regular Expression: [a-zA-Z0-9]
	  
	  String str1=str.replaceAll("[^0-9]", "");
	  
	  System.out.println(str1);
	 
   }
}
