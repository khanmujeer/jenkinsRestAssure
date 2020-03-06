package impJavaProg;

import java.util.HashMap;

public class FreqofCharUsingMap {

	public static void main(String[] args) {
		String s="java";
		char[] ch=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) 
		{
			if(hm.containsKey(ch[i]))
				hm.put(ch[i], hm.get(ch[i])+1);
			else
			    hm.put(ch[i], 1)	;	
		}
		System.out.println(hm);

	}

}
