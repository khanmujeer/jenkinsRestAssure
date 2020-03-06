package numberImpProg;

public class FiboRecu {

	public static void main(String[] args) 
	{
         System.out.println(fib(10));
	}
    static int fib(int n)
    {
    	int f[]=new int[n+2];
    	f[0]=0;
    	f[1]=1;
    	int i;
    	for (i = 2; i <= n; i++) 
    	{
    	f[i]=f[i-1]+f[i-2];
    	}
    	return f[n];
    }
}
