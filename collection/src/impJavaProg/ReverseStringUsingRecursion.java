package impJavaProg;

public class ReverseStringUsingRecursion 
{
    public static String reverse(String str)
    {
    	if(str.length()==0)
    	return str;
    	else
    	 return reverse(str.substring(1))+str.charAt(0); 		
    }
    public static String reverse1(String s)
    {
    	if(s==null||s.equals(""))
    	return s;
         // last char+ recursion of remaining String
    	 return s.charAt(s.length()-1)+reverse1(s.substring(0,s.length()-1)); 		
    }
    public static void main(String[] args) 
    {
    	
		String rev=reverse("abcde");
		System.out.println(rev);
		System.out.println(reverse1("abcd"));
	}
}
