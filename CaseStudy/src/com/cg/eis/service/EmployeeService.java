package com.cg.eis.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.cg.eis.bean.*;
import com.cg.eis.pl.*;



//Using comparator classes for sorting
//class FnameComparator implements Comparator<Employee>
//{
//	@Override
//	public int compare(Employee o1, Employee o2) 
//	{
//		String x=o1.getFirstName();
//		String y=o2.getFirstName();
//		int z=x.compareTo(y);
//		return z;
//	}	
//}
//
//class EmpIdComparator implements Comparator<Employee>
//{
//	@Override
//	public int compare(Employee o1, Employee o2) 
//	{
//		int x=o1.getEmployeeId();
//		int y=o2.getEmployeeId();
//		if(x==y)
//			return 0;
//		else if(x>y)
//			return 1;
//		return -1;
//	}	
//}
//
//
//class DeptIdComparator implements Comparator<Employee>
//{
//	@Override
//	public int compare(Employee o1, Employee o2) 
//	{
//		int x=o1.getDep().getDepartmentId();
//		int y=o2.getDep().getDepartmentId();
//		if(x==y)
//			return 0;
//		else if(x>y)
//			return 1;
//		return -1;
//	}
//	
//}



public class EmployeeService 
{   //1
	public double getSumOfSalary(List<Employee> elist)
	{
		double sal=elist.stream().mapToDouble(e->e.getSalary()).sum();
		return sal;
	}
	
	//2
    public void departmentNameAndEmployeeCount(List<Employee> elist, List<Department> dlist)
    {
    	dlist.stream().map(d->d.getDepartmentName());   //.forEach(s->System.out.println(s));		
    	List<Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());	//Returns List without null values of that field
    	for (Department dept:dlist)
    	{
    		long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
    		System.out.println(dept.getDepartmentName()+": "+count);
    	}
    }

    //3
    public void seniorMostEmployee(List<Employee> elist)
    {
    	LocalDate minDate = elist.stream().map(e->e.getLocalDate()).min(Comparator.comparing(LocalDate::toEpochDay)).get();
    	elist.stream().filter(e->e.getLocalDate().equals(minDate)).forEach(s->System.out.println(s));   //We first retrieve the oldest join date and retrieve the employee details who joined at that date
    }
    
    //4
    public void nameAndDurationOfService(List<Employee> elist) 
    {
    	//This function retrieves the joining date as LocalDate format, finds the duration with todays date 
    	//and retrieves interval of months days and years between the two and returns as String
    	Function<LocalDate, String> dateDisplay = (joiningDate) -> 
    	{	 
    		Period p = Period.between(joiningDate, LocalDate.now()); 	
    		return "Years: "+p.getYears()+", Months: "+p.getMonths()+", Days: "+p.getDays();
    	};
    	elist.stream().map(e->"Name: "+e.getFirstName()+" "+e.getLastName()+", "+dateDisplay.apply(e.getLocalDate())).forEach(s->System.out.println(s));
    }


	//5
	public List<Employee> getEmployeeWithoutDept(List<Employee> elist)
	{
		List<Employee> l=elist.stream().filter(e->e.getDep()==null).collect(Collectors.toList());
		return l;
	}
	
	//6
	 public void departmentsWithoutEmployees(List<Employee> elist, List<Department> dlist)
     {
  		List<Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());	 //Returns List without null values of that field
  		for (Department dept:dlist) 
  		{
  			long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
  			if (count == 0) 
  			{
  				System.out.println(dept.getDepartmentName());
  			}
  		}
	 }

	 //7
	 public void departmentWithHighestCount(List<Employee> elist, List<Department> dlist) 
	 {
		List <Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getDep())).collect(Collectors.toList());	  //Returns List without null values of that field
		tempElist.stream().map(e->e.getFirstName());		
		Map<String, Long> departmentCount = new HashMap<String, Long>();	//HashMap of dept name and count of employees
		for (Department dept:dlist) 
		{										
	    	long count = tempElist.stream().filter(d->dept.getDepartmentId() == d.getDep().getDepartmentId()).count();
	    	departmentCount.put(dept.getDepartmentName(), count);
	    }
	    System.out.println(departmentCount.entrySet().stream().max((dept1, dept2) -> dept1.getValue() > dept2.getValue() ? 1 : -1).get().getKey());		
	     // https://stackoverflow.com/questions/5911174/finding-key-associated-with-max-value-in-a-java-map
	 }

	 //8
	 public void employeeNameHireDate(List<Employee> elist) 
	 {
		  elist.stream().map(e->"Name: "+e.getFirstName()+" "+e.getLastName()+", Date: "+e.getLocalDate()+", Day of the Week: "
	             +e.getLocalDate().getDayOfWeek()).forEach(s->System.out.println(s));
	 }

	 //9
	 public void employeeNameHireDateFriday(List<Employee> elist) 
	 {
		  elist.stream().filter(e->e.getLocalDate().getDayOfWeek().toString().equalsIgnoreCase("Friday")).map(e-> "Name: " 
	             +e.getFirstName()+ " " +e.getLastName()+ ", Date: " +e.getLocalDate()+ ", Day of the Week: " 
				  +e.getLocalDate().getDayOfWeek()).forEach(s->System.out.println(s));
	 }

	 //10
	 public void employeeReportsTo(List<Employee> elist) 
	 {
		 Function<Integer, String> getManagerName = (managerId) -> 
		 {
			for (Employee e: elist) 
			{
				if(e.getEmployeeId() == managerId)
				{
						return e.getFirstName()+" "+e.getLastName();
				}
			}
	        return "no one";
		 };
	     elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" reports to "+getManagerName.apply(e.getManagerId()))
	                   .forEach(s->System.out.println(s));
	 }

	//11
	public List<String> getSalInc(List<Employee> elist)
	{
		List<String> l=elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" "+e.getSalary()+" "+e.getSalary()*1.5).collect(Collectors.toList());
		return l;
	}
		
	//12
	public List<Employee> didnotHaveManager(List<Employee> elist)
	{
		List<Employee> l=elist.stream().filter(e->e.getManagerId()==null).collect(Collectors.toList());
		return l;
	}
	
	//13
	 public void findSubOrdinates(List<Employee> elist,String firstName,String lastName) 
	 {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter First Name & Last Name of Manager:");
//		String firstName = sc.next();
//		String lastName = sc.next();
		int managerId = 0;
		for(Employee e: elist) 
		{
			if (e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName)) 
			{
				managerId = e.getEmployeeId();
				break;
			}
		}
		List <Employee> tempElist = elist.stream().filter(d->!Objects.isNull(d.getManagerId())).collect(Collectors.toList());	//Returns List without null values of that field
		Integer mid = new Integer(managerId);
		tempElist.stream().filter(e-> e.getManagerId() == mid.intValue()).forEach(s->System.out.println(s));
	    //sc.close();
	}

	//14
	//using lambda expressions for sorting
	public List<Employee> sortName(List<Employee> elist)
	{
		Comparator<Employee> nameComparator =(e1,e2)->e1.getFirstName().compareTo(e2.getFirstName());
		List<Employee> e=(List<Employee>) elist.stream().sorted(nameComparator).collect(Collectors.toList());
		return e;
	}	
	//or use
//	public void sortName(List<Employee> elist) 
//	{
//		elist.stream().sorted(Comparator.comparing(Employee::getFirstName)).forEach(s->System.out.println(s));
//	}

	
	public List<Employee> sortEmpId(List<Employee> elist)
	{
		Comparator<Employee> EmpidComparator = (o1, o2) ->
		{
			int x=o1.getEmployeeId();
			int y=o2.getEmployeeId();
			if(x==y)
				return 0;
			else if(x>y)
				return 1;
			return -1;
		};
		List<Employee> e=elist.stream().sorted(EmpidComparator).collect(Collectors.toList());
		return e;
	}	
	//or use 
//	public void sortEmpId(List<Employee> elist)
//	{
//		elist.stream().sorted(Comparator.comparing(Employee::getEmployeeId)).forEach(s->System.out.println(s));
//	}

	
	public List<Employee> sortDeptId(List<Employee> elist)
	{
		List<Employee> tempElist = elist.stream().filter(e->!Objects.isNull(e.getDep())).collect(Collectors.toList());		//Returns List without null values of that field
		tempElist.stream().sorted(Comparator.comparing(e-> e.getDep().getDepartmentId() ));   //.forEach(s->System.out.println(s));
		return tempElist;
	}
    //or use
//	public List<Employee> sortDeptId(List<Employee> elist)
//	{
//		Comparator<Employee> DeptidComparator = (o1, o2) ->
//		{
//			int x=o1.getDep().getDepartmentId();
//			int y=o2.getDep().getDepartmentId();
//			if(x==y)
//				return 0;
//			else if(x>y)
//				return 1;
//			return -1;
//		};
//		List<Employee> e=elist.stream().sorted(DeptidComparator).collect(Collectors.toList());
//		return e;
//	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	//using comparator classes for sorting
//	public List<Employee> sortName(List<Employee> elist)
//	{
//		Collections.sort(elist, new FnameComparator());
//		return elist;
//	}
//	
//	public List<Employee> sortEmpId(List<Employee> elist)
//	{
//		Collections.sort(elist, new EmpIdComparator());
//		return elist;
//	}
//	
//	public List<Employee> sortDeptId(List<Employee> elist)
//	{
//		Collections.sort(elist, new DeptIdComparator());
//		return elist;
//	}
	
	
}
