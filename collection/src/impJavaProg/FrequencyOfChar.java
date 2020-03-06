package impJavaProg;

public class FrequencyOfChar {

	public static void main(String[] args)
	{
		System.out.println("The duplicate character are:");
   	    System.out.println("char\tFreq");
        System.out.println("---------------");
        
          String str="java";
          for(char ch='a';ch<='z'; ch++)
          {
			int count=0;
			for (int i = 0; i < str.length(); i++) 
			{
				if(str.charAt(i)==ch)
					count++;
			}
		     if(count>0)
		     {
		    	 System.out.println(ch+"\t"+count);
		     }
          }
	}

}
