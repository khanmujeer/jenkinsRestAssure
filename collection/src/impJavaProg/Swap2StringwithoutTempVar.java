package impJavaProg;

public class Swap2StringwithoutTempVar 
{
	public static void main(String[] args) 
	{
            String a,b;
            
            a="Sorry";
            b="Babu";
            System.out.println("Before Swap: " +a+ " "  +b);
            
            a=a+b; //a=SorryBabu
            b=a.substring(0, a.length()-b.length());
            a=a.substring(b.length());
           
           System.out.println("After Swap: "+a+ " "  +b);
	}

}
