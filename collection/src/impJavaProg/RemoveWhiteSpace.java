package impJavaProg;

public class RemoveWhiteSpace 
{
	public static void main(String[] args) 
	{
	   String str="I Love My India";
	   String s="";
	  
	   
	   for (int index=0  ; index < str.length(); index++)
	   {
		index=str.indexOf(" ");
		if(index!=-1)
			s=str.substring(0, index)+str.substring(index+1);
		
	   }
	   System.out.println(s);
	  
	}}
