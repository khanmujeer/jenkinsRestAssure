package numberImpProg;

public class PrintArmstrong {

	public static void main(String[] args) 
	{
		  
	
	}
	public static boolean isArmstrong(int num) 
	{ 
		int n=num;
		double sum=0;
		while(n!=0) 
		{
		sum=sum+Math.pow(n%10, 3);
		n=n/10;
		}
		if(sum==n)
		    return true;
		else
		   return false;
		
	}
}
