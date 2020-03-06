package empproject;

public abstract class Emp implements Employees
{
	String name;
	int id;
	double sal;
	
	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public void displayAttributes()
	{
		System.out.println("Name: " +name);
		System.out.println("ID : " +id);
		System.out.println("Salary: " +sal);
	}
}
