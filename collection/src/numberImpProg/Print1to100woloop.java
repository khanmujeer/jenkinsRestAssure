package numberImpProg;

public class Print1to100woloop {

	public static void printNum()
	{		int n=1;
		if(n<11)
		{
			System.out.println(n);
			n++;
			printNum();
		}
		 	
	}
	public static void main(String[] args) 
	{
              printNum();
	}

}
