package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) 
	{
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}


public class UserDefinedType 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Sachin","Hr"));
		emp.add(new Employee(2,"Sneha","Developer"));
		emp.add(new Employee(3,"Srujan","Tester"));
		
		System.out.println(emp);
		Iterator<Employee> it=emp.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println(e.id+" "+e.name+" "+e.dept);
		}
		System.out.println(emp);
	}

}
