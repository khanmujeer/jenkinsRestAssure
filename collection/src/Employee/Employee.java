package Employee;

public class Employee implements Comparable<Employee>
{
	int id;
    String name;
    double sal;
	public Employee(int id, String name, double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSal() {
		return sal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[id="+id+",name="+name+",salary="+sal+"]";
	}

	@Override
	public int compareTo(Employee o) {
		if(this.getId()>o.getId())
		return 1;
		else if(this.getId()<o.getId())
			return -1;
		else	
			return 0;
	}
	
    
    
}
