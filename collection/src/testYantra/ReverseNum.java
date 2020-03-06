package testYantra;

public class ReverseNum 
{
	public static int reverse(int num) {
    	int n=num;
		int rem,rev=0;
		
		for (; n!=0;n/=10) 
		{
			rem=n%10;
			rev=rev*10+rem;
		}
		return rev;
	}
    public static void main(String[] args)
    {
    	reverse(12345);
	}
}
