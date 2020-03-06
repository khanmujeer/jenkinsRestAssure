package impJavaProg;

public class FindMissingNum {

	public static void main(String[] args) 
	{
		int[] num= {1,2,3,5};
		int sum1=0;
		int sum2=0;
		
		for (int i = 0; i < num.length; i++) 
		{
			sum1=sum1+num[i];
		}
		System.out.println(sum1);
       for (int j = 1; j < 5; j++) 
       {
    	   sum2=sum2+num[j];
	   }
       System.out.println(sum2);
       
       System.out.println("Missing number:::>"+(sum2-sum1));
	}

}
