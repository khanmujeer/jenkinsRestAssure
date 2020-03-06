package arraylist;

import java.util.ArrayList;

public class Ass3 {
	static double findAvg(ArrayList<Integer> a)
	{
		Integer sum=0;
		ArrayList<Integer> oldlist= a;
		ArrayList<Integer> newlist= new ArrayList<>();
		for (int i = 0; i < oldlist.size(); i++) {
			sum=sum + newlist.get(i);
			}
		return sum/newlist.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(findAvg(list));
	}

}
