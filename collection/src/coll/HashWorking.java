package coll;

import java.util.HashMap;
import java.util.Map;

public class HashWorking {

	public static void main(String[] args) 
	{
         Map<String, Integer> map= new HashMap<String, Integer>();
         String s1= "FB";
         String s2="Ea";
         System.out.println("S1="+s1.hashCode() + "\nS2="+ s2.hashCode());
         map.put(s1, 1);
         map.put(s2, 2);
         
         map.put("ABC", 3);
         map.put("BCD",4);
         
         
	}

}
