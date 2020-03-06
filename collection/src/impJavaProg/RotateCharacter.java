package impJavaProg;

public class RotateCharacter 
{
	public static void main(String[] args) 
	{
           String str="abcdef";
           int n=1;
          String r = rotateACLeft(str, n);
          System.out.println(r);
          System.out.println(rotateCRight(str, n));     
	}
    public static String rotateACLeft(String str,int n) 
    {
    	return str.substring(n)+str.substring(0, n);
    }
    public static String rotateCRight(String str,int n) 
    {
    	return str.substring(str.length()-n)+str.substring(0,str.length()-n);
    }
}
