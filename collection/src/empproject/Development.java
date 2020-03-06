package empproject;

public abstract class Development extends Emp
{
	static String dname="Development";	
	Development(String name, int id, double sal)
	{
		super(name,id,sal);
	}
	
	public void displayAttributes()
	{
		super.displayAttributes();
		System.out.println("Department name"+dname);
	}
}
