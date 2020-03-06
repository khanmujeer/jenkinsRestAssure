package Employee;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args)
	{     
		Employee e1= new Employee(5, "B Raj", 5000);
		Employee e2= new Employee(6, "A Raju", 7000);
		Employee e3= new Employee(5, "C Rajesh", 15000);
		Scanner sc= new Scanner(System.in);
		int option= sc.nextInt();
		System.out.println("Option 1: Sort By Id Asc");
		System.out.println("Option 2: Sort By Id Desc");
		System.out.println("Option 3: Sort By Name Asc");
		System.out.println("Option 4: Sort By Name Desc");
		System.out.println("Option 5: Sort By Salary Asc");

		switch(option)
		{
		case 1:
			TreeSet<Employee> emp= new TreeSet<>();
			System.out.println("According to ID in Ascending Order");
			emp.add(e1);
			emp.add(e2);
			emp.add(e3);
			emp.add(new Employee(1, "Rajan", 2000));
			System.out.println(emp);
			break;
		case 2:
			TreeSet<Employee> set2= new TreeSet<>(new SortByIdDescen());
			System.out.println("According to ID in Descending Order");
			set2.add(e1);
			set2.add(e2);
			set2.add(e3);
			System.out.println(set2);
			break;
		case 3:
			System.out.println("According to Name in Ascending Order");
			TreeSet<Employee> set3= new TreeSet<>(new SortByName());
			set3.add(e1);
			set3.add(e2);
			set3.add(e3);
			System.out.println(set3);
			break;
		case 4:
			System.out.println("According to Name in Descending Order");
			TreeSet<Employee> set4= new TreeSet<>(new SortByName());
			set4.add(e1);
			set4.add(e2);
			set4.add(e3);
			System.out.println(set4);
			break;
		
		default:
			System.out.println("Invalid option");
			
		}
	}

}
