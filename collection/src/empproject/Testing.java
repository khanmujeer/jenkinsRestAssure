package empproject;

abstract public class Testing extends Emp
{
	static String dname="Testing";
	
	Testing(String name, int id, double sal)
	{
		super(name, id, sal);
	}
	public void displayAttributes()
	{
		super.displayAttributes();
		System.out.println("Department name"+dname);
	}
}