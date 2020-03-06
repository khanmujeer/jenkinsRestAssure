package empproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {

		public ArrayList<Emp> e=new ArrayList<>();
		
		// add employee
		public void addEmployee(Emp obj)
		{
			e.add(obj);
		}
		
		// search by id
		public Emp searchById(int id)
		{
			Iterator<Emp> i= e.iterator();
			while(i.hasNext())
			{
				Emp temp= i.next();
				if(temp.id ==  eid)
				{
					return temp;
				}
			}
			return null;
		}
		
		//to remove an employee
		public void removeById(int id)
		{
			Iterator<Emp> i= e.iterator();
			while(i.hasNext())
			{
				Emp temp= i.next();
				if(temp.id ==  id)
				{
					e.removeAll(id);
				}
			}
		}
		
		public ArrayList<Emp> searchByName(String name)
		{
			ArrayList<Emp> a= new ArrayList<>();
			
			for (int i = 0; i < e.size() ; i++) {
				
				Emp temp=e.get(i);
				if(temp.name.equalsIgnoreCase(name))
				{
					a.add(temp);
				}
				
			}
			return a;
		}

}
