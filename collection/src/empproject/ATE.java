package empproject;

public abstract class ATE extends Testing
{

static String desig="Automation Test Engineer";	
	
	ATE(String name, int id, double sal)
	{
		super(name,id,sal);
    }
	public void displayAttributes()
	{
		super.displayAttributes();
		System.out.println("Designation"+desig);
	}
}
