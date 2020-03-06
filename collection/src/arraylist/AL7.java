package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AL7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList ls= new ArrayList();
         Scanner s= new Scanner(System.in);
         
         ls.add(10);
         ls.add(20);
         ls.add(30);
         System.out.println(ls);
         
         ArrayList ls2= new ArrayList();
         ls2.add(20);
         ls2.add(40);
         System.out.println(ls2);
         
        boolean f1= ls.containsAll(ls2);
        System.out.println(f1);
        
        boolean f2= ls.contains(ls2);
        System.out.println(f2);
        
	}

}
