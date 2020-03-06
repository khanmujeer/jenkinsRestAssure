package impJavaProg;

public class ReverseStringPreservingSpace 
{
	public static void main(String[] args)
	{
            String str="abc de fg";
            char[] ch = str.toCharArray();
            char[] res = new char[ch.length];
            
            //pahle space ka index pta kro aur usi index me space
             // insert kro ek empty char array ref var. me
            for (int i = 0; i < res.length; i++) 
            {
            	if(ch[i]==' ')
            		res[i]=' ';				
			}
            System.out.println(res);
  
            int j=ch.length-1;
           for (int i = 0; i < ch.length; i++)
           {
			if(ch[i]!=' ')// ch me space h
			{
			   if(res[j]==' ')//res me bhi space h
				       j--;
				    
			    res[j]=ch[i];
				       j--;
		     }
           }
           System.out.println(str);
           System.out.println(res);
            
	}

}
