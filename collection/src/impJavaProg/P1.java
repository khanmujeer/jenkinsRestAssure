package impJavaProg;

public class P1 {

	public static void main(String[] args) {

		String str="abcd";
		StringBuffer sb= new StringBuffer(str);
		sb = sb.reverse();
		System.out.println(sb);
		
		System.out.println(new StringBuffer(str).reverse());
		
	}

}
