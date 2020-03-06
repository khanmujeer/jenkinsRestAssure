package arraylist;

import java.util.ArrayList;

public class Ass33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(40);
		System.out.println("List: "+list);
		int sum=0;
		int avg;
		for (int i = 0; i < list.size(); i++) {
			sum=sum+list.get(i);
		}
		avg=sum/list.size();
		System.out.println("Average: "+avg);
	}
}
