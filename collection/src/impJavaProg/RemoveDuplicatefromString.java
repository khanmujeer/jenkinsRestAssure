package impJavaProg;

import java.util.HashSet;

public class RemoveDuplicatefromString {
public static void main(String[] args) {
	 
	String str="Hello";
	char[] ch=str.toCharArray();
	System.out.println(ch);
	
	HashSet s=new HashSet();
	for (int i = 0; i < ch.length; i++) {
		s.add(ch[i]);
	}
	System.out.println(s);
	
}
}
