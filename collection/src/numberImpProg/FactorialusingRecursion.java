package numberImpProg;

public class FactorialusingRecursion 
{
	public static void main(String[] args)
	{
             int n=5;
            System.out.println( fact(n));
	}
	//n!=n*n-1*n-2*........1
	public static int fact(int n) //n=6,5
	{
	
		/*
		 * if(n>=1)  
		 *    return n* fact(n-1);//6*fact(5),6*5*fact(4)
		 * else 
		 *    return 1;
		 */
		return n>=1?n*fact(n-1):1;
	}

}
