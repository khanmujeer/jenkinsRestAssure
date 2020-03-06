package arrayprog;

import java.util.Scanner;

public class SelectionSortUsingMethod {
	
	public static int[] createArray(int n)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		n=s.nextInt();
		System.out.println("Enter the values in the array:");
		int a[]= new int[n];
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=s.nextInt();
		}
		return a;
	}

	public static void printArray(int[] a)
	{
		for (int i:a) 
		{
		System.out.println(i);
		}
	}
	
	public static void sortInAscending(int[] a)
	{
		for (int i = 0; i < a.length-1; i++) {
			int min_pos=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[min_pos]>a[j])
					min_pos=j;
			}
			if(min_pos!=i)
			{
				int temp=a[i];
				a[i]=a[min_pos];
				a[min_pos]=temp;
			}
			
		}
		//return a;
	}
	public static void main(String[] args) {
		 
        createArray(5);
        sortInAscending();
	}

}
