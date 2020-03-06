package practise;

public class Emp implements Comparable<Emp> {
	int id;
	String name;
	double sal;
	public Emp(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", sal=" + sal ;
	}

	public int compareTo(Emp e) {
		
	return this.id-e.id	;// -1 0 1
	}

}
