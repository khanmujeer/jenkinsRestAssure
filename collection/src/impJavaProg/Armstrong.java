package impJavaProg;

public class Armstrong {

	public static void main(String[] args) {
		
		int cube=0;
		int num=153;
		int n=num;
		for(;n!=0;n/=10)
		{
		  int rem=n%10;
		  cube=cube+(rem*rem*rem);
		}
		
		if(cube==num)
			System.out.println("Armstrong");
		else
			System.out.println("Not an Armstrong");

	}

}
