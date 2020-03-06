package arraylist;

import java.util.ArrayList;

public class AL3Case1 {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
       ArrayList l= new ArrayList();
       l.add(10);
       l.add(20);
       l.add(2,30);
       System.out.println(l);
       
       ArrayList l2= new ArrayList();
       l2.add(20);
       l2.add(40);
       l2.add(50);
       System.out.println(l2);
       l2.add(2,l);
       System.out.println(l2.size());
       System.out.println(l2);
	}

}
