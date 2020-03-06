package practise;

import java.util.Comparator;

public class SortByName implements Comparator<Emp> {
	
		public int compare(Emp e1,Emp e2)
		{
			return e1.name.compareTo(e2.name);
		}

	}
