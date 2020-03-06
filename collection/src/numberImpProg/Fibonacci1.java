package numberImpProg;

public class Fibonacci1 {

	public static void main(String[] args) 
	{
		int a,b,c;
		for (int i = 1; i <=8; i++) 
		{
			switch(i)
			{
			case 1:
				System.out.println(0);
				break;
			case 2:
				System.out.print(1);
				break;
			default:
				a=0; b=1;
				for (int j = 1; j < i; j++) 
				{
					c=a+b;
					a=b;
					b=c;
				}
				System.out.print(" "+a);
			}
		}
	}
}
