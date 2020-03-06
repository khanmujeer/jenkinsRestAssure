package arraylist;

import java.util.ArrayList;

public class AL3Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList ls1= new ArrayList();
       ls1.add(10);
       ls1.add(20);
       ls1.add(30);
       System.out.println(ls1);
       
       ArrayList ls2= new ArrayList();
       ls2.add(20);
       ls2.add(20);
       ls2.add(40);
       System.out.println(ls2);
       
       ls2.addAll(ls1);
       
       System.out.println(ls2.size());
       System.out.println(ls2);
	}

}
