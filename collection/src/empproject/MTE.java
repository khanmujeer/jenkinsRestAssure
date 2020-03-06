package empproject;

abstract public class MTE extends Testing
{
	static String desig="Test Engineer";
	
	MTE(String name, int id, double sal)
	{
		
		super(name,id,sal);
    }
	
	public void displayAttributes()
	{
		super.displayAttributes();
		System.out.println("Designation"+desig);
	}
}