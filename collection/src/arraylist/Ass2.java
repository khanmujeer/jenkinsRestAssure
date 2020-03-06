package arraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Ass2 {
static Collection<Integer> toAscii(Collection<Character> c)
{
	ArrayList<Character> oldlist= (ArrayList<Character>)c;
	ArrayList<Integer> newlist= new ArrayList<>();
	
	for (int i = 0; i < oldlist.size(); i++) {
	newlist.add((int)oldlist.get(i).charValue())	;
	}
	return newlist;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Character> list= new ArrayList<>();
		list.add('A');
		list.add('B');
		list.add('a');
		System.out.println(list);
		//ArrayList<Integer> ascii= ( ArrayList<Integer>)toAscii(list);
		System.out.println(toAscii(list));
	}

}
