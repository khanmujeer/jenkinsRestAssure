package practise;

public class Reverse1stHalfSeparately 
{
   public static void main(String[] args)
	{
		String str="abcdcba";
		String rev1="";
		String rev2="";
		int m=str.length()/2;
	   for(int i=0;i< m;i++)
	   {
		  rev1=str.charAt(i)+rev1 ;
	   }
	   System.out.print(rev1+" ");
	   
	   for(int i=m;i< str.length();i++)
	   {
		  rev2=str.charAt(i)+rev2 ;
	   }
	   System.out.print(rev2);
	   
	}

}
