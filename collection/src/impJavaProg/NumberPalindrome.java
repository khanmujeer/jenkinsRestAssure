package impJavaProg;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		int num=123; 
		int n=num;// dont disturb original
		int rem;
		int rev=0;
		
		for (   ; n!=0 ; n/=10 ) //n=121,12,1,0, 0 pe condition false out of loop
		{
			//rev=rev*10+n%10;
			rem=n%10;    // 121%10=1, 12%10=2,1%10=1,
			
			rev=rev*10+rem;	 // 0*10+1=1,1*10+2=12,12*10+1=121
		}
		System.out.println("Reverse of the number:::>"+rev);
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		System.out.println(rev==num?"Palindrome":"Not a Palindrome");
	}

}
