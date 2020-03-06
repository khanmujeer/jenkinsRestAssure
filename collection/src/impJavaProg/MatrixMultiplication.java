package impJavaProg;

import java.util.Scanner;

public class MatrixMultiplication
{
	public static int[][] matrixMultiplication (int a[][], int b[][]) 
	{
// to multiply matrix column of matrix A should be equal to row of matrix B
		if(a[0].length!=b.length) 
		{
			return null;
		}
		// resultant matrix's order is row of A(m) & column of B(n)
		int c[][]= new int[a.length][b[0].length];
		// to multiply
		
		for (int i = 0; i < c.length; i++)//fixed
		  {
			for (int j = 0; j < c.length; j++) //fixed
			  {
				int sum=0;
				for (int k = 0; k < a[0].length; k++)// variable 
				{
					sum+=a[i][k]*b[k][j];	
				}
			        c[i][j]=sum;
			 }	
		 }
		return c;
	}
	
	public static int[][] readmatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter order of matrix");
		int m1= sc.nextInt();
		int n1=sc.nextInt();
		
		int a[][]= new int[m1][n1];
		
		System.out.println("Enter the element of matrix");
		for (int i = 0; i < m1; i++) 
		{
			for (int j = 0; j < n1; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	public static void printMatrix(int c[][])
	{
		for (int i = 0; i < c.length; i++) 
		{	
			for (int j = 0; j < c.length; j++) 
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) 
	{
		 int a[][]=readmatrix();
		 int b[][]=readmatrix();
		 int c[][]= matrixMultiplication(a, b);
		 if(c==null)
			 System.out.println("invalid order");
		 else
		 {
			 System.out.println("Product matrix is:");
			 printMatrix(c);
		 }
    }
}
