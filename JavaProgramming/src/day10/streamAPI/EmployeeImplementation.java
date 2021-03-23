/*
Lambda Expression and Stream API

Create Employee Class with below properties
 Int empid, String name, double salary, String mgrname,deptno;
 
Create EmployeeImplementation class for following functionalities
1.	Write the method using lambda expression and stream API to find Employee with highest salary.
2.	Write the method using lambda expression and stream api to find count of employee reporting to “nitin”
3.	Write the method using lambda expression and stream api to return arraylist of employee objects where every employee salary
    is less than 50000
4.	Write the method using lambda expression and stream api to return employee names in arraylist who are working in deptno 10;
5.	Write the method using lambda expression and stream api to return count of employees working in deptno 20;
6.	Write the method using lambda expression and stream api to return arraylist of employee objects where all employee name start 
    with ‘A’

 */

//refer EmployeeTask class
package day10.streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImplementation 
{
	public static void main(String[] args) 
	{
		ArrayList<EmployeeTask> emplist =new ArrayList<EmployeeTask>();
		emplist.add(new EmployeeTask(1,"sachin",45000,"nitin",10));
		emplist.add(new EmployeeTask(2,"anil",55000,"Ram",20));
		emplist.add(new EmployeeTask(3,"kumar",65000,"varma",2));
		emplist.add(new EmployeeTask(4,"anish",45000,"sunil",4));
		emplist.add(new EmployeeTask(5,"manish",50000,"nitin",10));
		
		System.out.println("Emplist: "+emplist);
		System.out.println();
		
		System.out.println("=====1.Employee with highest salary=====");
		System.out.println(emplist.stream().mapToDouble(e->e.getSalary()).max());
		System.out.println();
		
		System.out.println("=====2.No of Employees reporting to nitin=====");
		long count1=emplist.stream().filter(e->e.getMgrname().equalsIgnoreCase("nitin")).count();	
		System.out.println(count1);
		System.out.println();
		
		System.out.println("====3.Return arraylist of employees whose salary < 50000====");
		List<EmployeeTask> emp=emplist.stream().filter(s->s.getSalary()<50000).collect(Collectors.toList());
		emp.forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("====4.Return arraylist of employees working in dept=10====");
		List<EmployeeTask> empdept=emplist.stream().filter(s->s.getDeptno()==10).collect(Collectors.toList());
		empdept.forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("====5.Return count of employees working in dept=20====");
		long count2=emplist.stream().filter(e->e.getDeptno()==20).count();	
		System.out.println(count2);
		System.out.println();
		
		System.out.println("====6.Return arraylist of employees whose name starts with a====");
		List<EmployeeTask> empnameA=emplist.stream().filter(s->s.getName().startsWith("a")).collect(Collectors.toList());
		empnameA.forEach(s->System.out.println(s));
		System.out.println();
	}

}
