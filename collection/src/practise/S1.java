package practise;

public class S1 {

	public static void main(String[] args)
	{
        String s="abc de fg";
        char ch[]=s.toCharArray();
        char[] res= new char[ch.length];
        
        for (int i = 0; i < ch.length; i++) 
        {
			if(Character.isSpace(ch[i]))
			{
				res[i]=' ';
			}
		}
        System.out.println(res);
        for (int i = 0; i < ch.length; i++)
        {
			if(Character.isAlphabetic(i))
			{
				System.out.println(ch[i]);
				if(res[i]==' ')
					i++;
				    res[i]=ch[i];
					
			}
		}
        System.out.println(res);
	}

}
