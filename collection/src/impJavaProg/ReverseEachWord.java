package impJavaProg;

public class ReverseEachWord 
{
	public static void main(String[] args) 
	{
      String sent="I love my India ";
      String[] arr = sent.split(" ");
      for (String w : arr) 
      {
       System.out.print(new StringBuffer(w).reverse()+ " ");
	  }
	}

}
