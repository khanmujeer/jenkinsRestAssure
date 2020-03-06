package arraylist;
import java.util.ArrayList;
/*
 * Design a method which can accept a collection of String and 
 * returns collection of String where every String is converted
 * to upper Case.
 */
import java.util.Collection;

public class Ass1 {
public static void main(String[] args) 
	{
	  ArrayList <String> list= new ArrayList<>();
	  list.add("ram");
	  list.add("Sita");
	  list.add("Laxman");
	  System.out.println("List: " +list);
	  System.out.println("New List: "+toUpper(list));
	}
  static Collection <String>  toUpper(Collection <String> c)
  {
	  ArrayList <String> oldlist= (ArrayList <String>) c;// downcast
	  ArrayList <String> newlist= new ArrayList<>();// Empty
	  
	  for (int i = 0; i < newlist.size(); i++) {
		newlist.add(oldlist.get(i).toUpperCase());
	}
	return newlist;  
  }
}
