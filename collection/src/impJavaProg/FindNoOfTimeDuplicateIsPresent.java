package impJavaProg;

import java.util.HashMap;
import java.util.Set;

public class FindNoOfTimeDuplicateIsPresent {
	public static void main(String[] args) 
	{
		findDuplicateWord("High hi hi High");
	}

	public static void findDuplicateWord(String ipStr) {
		String[] words = ipStr.split(" ");

		HashMap<String, Integer> wC = new HashMap<>();
		//System.out.println(wC);
		for (String word : words) {
			//System.out.println(word + " ");
			// if word is present

			if (wC.containsKey(word))
				wC.put(word, wC.get(word) + 1);
			else
				wC.put(word, 1);
		} // end of for

		
		  Set<String> wInStr=wC.keySet(); 
		  for (String word : wInStr) 
		  {
		  if(wC.get(word)>1) 
		    System.out.println(word+":"+wC.get(word)); 
		  else
		    System.out.println(word+":"+wC.get(word)); 
		  }
		 
	}
}
