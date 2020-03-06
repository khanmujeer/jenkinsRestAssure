package impJavaProg;

public class RemoveWhiteSpace4 
{
	public static void main(String[] args) 
	{
	   String str="I Love My India";
		
		  char[] ch = str.toCharArray(); 
		  StringBuffer sb= new StringBuffer();
		  for(Character c: ch) 
		  { 
			  if(c!=' '&& c!='\t') 
			  sb.append(c); 
	      }
		  System.out.println(sb);
		  
		  
	   String[] arr = str.split(" "); 
       
		 String res="";
       
        for (String s: arr) 
        {
			res=res.concat(s);
		}
        System.out.println(res);
	}
    
}
