package impJavaProg;

public class MatricAddition {

	public static void main(String[] args) {
		
		int a[][]= {{9,5,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,8,9},{6,5,6},{7,8,9}};
		
		int c[][]= new int[a.length][a[0].length];
		
		for (int i = 0; i < c.length; i++) {
			
			for (int j = 0; j < c[0].length; j++) {
				
				c[i][j]=a[i][j]+ b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
			
		}

	}

}
