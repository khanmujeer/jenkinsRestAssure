package arrayprog;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=s.nextInt();
		
		int a[]= new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<a.length;i++)
		{
		    a[i]=s.nextInt();
		}
		for (int i = 0; i < a.length-1; i++) 
		{
			int min_pos=i;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min_pos]>a[j])
					min_pos=j;				
			}
			if(min_pos!=i)// then swap
			{
				int temp=a[i];
				a[i]=a[min_pos];
				a[min_pos]=temp;
			}
		}
		System.out.println("Sorted array are as follows:");
		for (int i : a) {
			System.out.println(i);
			
		}
		

	}

}
