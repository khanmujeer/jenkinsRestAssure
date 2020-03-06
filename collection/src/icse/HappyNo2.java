package icse;

import java.util.HashSet;
import java.util.Set;

public class HappyNo2 {

	public static void main(String[] args) 
	{
             int n=31;
             boolean res=isHappyNum(n);
             if(res==true)
            	System.out.println(n+" is a Happy Number"); 
             else
            	 System.out.println(n+"is a Not a Happy Number");
	}
	public static boolean isHappyNum(int num)
	{
		Set <Integer> set=new HashSet<Integer>();
		while(set.add(num))
		{
			int sum=0;
			while(num>0) 
			{
				sum+=Math.pow(num%10, 2);
			    num/=10;
			}
			num=sum;
		}
		if(num==1)
			return true;
		else
		    return false;
	}

}
