package empproject;

import java.util.Scanner;

public class CompanyDriver {
	
	static Company google= new Company();

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		boolean continue1= true;
		
		do {
			System.out.println("1. To add an emp");
			System.out.println("2. To search an emp");
			System.out.println("3. To remove an emp");
			System.out.println("4. To sort an emp");
			System.out.println("5. To display id and names of all the emp");
			System.out.println("6. To close the app");
			System.out.println("Enter your choice:");
			int choice=s.nextInt();
			
			switch(choice)
			{
			case 1://to add an employee
			{
				System.out.println("1. Manual TE");
				System.out.println("2. Automation TE");
				System.out.println("3. Developer");
				System.out.println("Enter your choice:");
				int ch=s.nextInt();
				switch(ch)
				{
				case 1:
				{
					System.out.println("Enter the id:");
					int id= s.nextInt();
					System.out.println("Enter the name:");
					String name= s.next();
					System.out.println("Enter the salary:");
					double sal= s.nextDouble();
					MTE obj= new MTE(name,id ,sal);
					//add in company
					google.addEmployee(obj);
				}
				break;
				
				case 2:
				{
					System.out.println("Enter the id:");
					int id= s.nextInt();
					System.out.println("Enter the name:");
					String name= s.next();
					System.out.println("Enter the salary:");
					double sal= s.nextDouble();
					ATE obj= new ATE(name,id,sal);
					//add in company
					google.addEmployee(obj);
				}
				break;
				
				case 3:
				{
					System.out.println("Enter the id:");
					int id= s.nextInt();
					System.out.println("Enter the name:");
					String name= s.next();
					System.out.println("Enter the salary:");
					double sal= s.nextDouble();
					Developer obj= new Developer(name,id,sal);
					//add in company
					google.addEmployee(obj);
				}
				break;
				
				}
			}//case 1 end
			break;
			
			case 2:
			{
				System.out.println("1. Manual TE");
				System.out.println("2. Automation TE");
				System.out.println("3. Developer");
				System.out.println("Enter your choice:");
				int ch=s.nextInt();
				
				System.out.println("Enter the id:");
				int id=s.nextInt();
				google.searchById(id);
				
			}
			case 3:
			{
				System.out.println("1. Manual TE");
				System.out.println("2. Automation TE");
				System.out.println("3. Developer");
				System.out.println("Enter your choice:");
				int ch=s.nextInt();
				
				System.out.println("Enter the id:");
				int id=s.nextInt();
				google.removeById(id);	
			}
			}
			
		}
       while(continue1);
	}

}
