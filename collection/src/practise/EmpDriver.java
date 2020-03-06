package practise;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDriver {

	public static void main(String[] args) {
		
		Emp e1=new Emp(3,"Ram",1000);
		Emp e2=new Emp(1,"Raj",5000);
		Emp e3=new Emp(2,"Amit",7000);
		
		ArrayList<Emp> al=new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		Collections.sort(al,new SortByName);

	}

}
