package day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Employee implements Comparable
{
	int id;
	String name;
	String dept;
	int salary;
	
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public int compareTo(Employee o)
	{
		if(id==o.id)
		{
			return 0;
		}
		else if(id>o.id)
		{
			return 1;
		}
		return -1;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}	
	
}


public class ComparableDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> emplist =new ArrayList<Employee>();
		emplist.add(new Employee(17,"suresh","ui",70000));
		emplist.add(new Employee(1,"ravi","hr",65000));
		emplist.add(new Employee(2,"anil","developer",80000));
		emplist.add(new Employee(4,"kumar","developer",95000));
		
		System.out.println("Employee list before sorting: "+emplist);
		for(Employee e: emplist)
		{
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
		}
		
		Collections.sort(emplist);
		System.out.println("Employee list after sorting: "+emplist);
		for(Employee e: emplist)
		{
			System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
		}
	}
}
