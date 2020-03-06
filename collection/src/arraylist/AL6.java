package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AL6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList menu = new ArrayList();
    menu.add("idli");
    menu.add("pav");
    menu.add("dosa");
    menu.add("samosa");
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the dish");
    String dish=s.next();
    if(menu.contains(dish))
    {
    	System.out.println("dish is present");
    }
    else
    	System.out.println("dish not present");
    
    a= l.contains("idli");
    System.out.println(l);
    
    
	}

}
