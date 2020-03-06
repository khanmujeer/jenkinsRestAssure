package exception;

public class ST {
	static void x()
	{
		System.out.println("From x");
		int a=10,b=0;
		int c=a/b;
		System.out.println(c);
	}
	static void y()
	{
		System.out.println("From y");
		x();
	}

	public static void main(String[] args) {
	System.out.println("FM");	
      y();
    System.out.println("ME");
	} 

}
