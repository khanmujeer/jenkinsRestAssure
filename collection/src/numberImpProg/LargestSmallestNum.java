package numberImpProg;

public class LargestSmallestNum {

	public static void main(String[] args) 
	{
		    System.out.println(largest(10,20));
		    System.out.println(largest(20,10));
		    
            System.out.println(largest(10,20,30));
            System.out.println(largest(20,10,30));
            System.out.println(largest(30,10,20));
            System.out.println(largest(30,20,10));
            
            System.out.println(smallest(10,20,30));
            System.out.println(smallest(20,10,30));
            System.out.println(smallest(30,10,20));
            System.out.println(smallest(30,20,10));
            
            System.out.println(middle(10,20,30));
            System.out.println(middle(20,10,30));
            System.out.println(middle(30,10,20));
            System.out.println(middle(30,20,10));
	}
	
	public static int largest(int a, int b) 
	{
		return a>b?a:b;
	}
	public static int largest(int a, int b, int c) 
	{
		return a>b&&a>c?a:b>c?b:c;
	}
	
	public static int smallest(int a, int b) 
	{
		return a<b?a:b;
	}
	public static int smallest(int a, int b, int c) 
	{
		return a<b&&a<c?a:b<c?b:c;
	}
	public static int middle(int a, int b, int c) 
	{
		//check for b----a<b<c or c<b<a
		if((a<b&&b<c)||(c<b&&b<a))
			return b;
		//check for a----bac or cab
		else if((b<a&&a<c)||(c<a&&a<b))
		   return a;
		else
			return c;	 
	}	
}
