package com.cg.eis.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
{
	public double getSumOfSalary(List<Employee> elist)
	{
		double sal=elist.stream().mapToDouble(e->e.getSalary()).sum();
		return sal;
	}
	
	public List<Employee> getEmployeeWithoutDept(List<Employee> elist)
	{
		List<Employee> l=elist.stream().filter(e->e.getDep()==null).collect(Collectors.toList());
		return l;
	}
	
	public List<Employee> didnotHaveManager(List<Employee> elist)
	{
		List<Employee> l=elist.stream().filter(e->e.getManagerId()==null).collect(Collectors.toList());
		return l;
	}
	
	public List<String> getSalInc(List<Employee> elist)
	{
		List<String> l=elist.stream().map(e->e.getFirstName()+" "+e.getLastName()+" "+e.getSalary()+" "+e.getSalary()*1.5).collect(Collectors.toList());
		return l;
	}
	
	//using lambda expressions for sorting
	public List<Employee> sortName(List<Employee> elist)
	{
		Comparator<Employee> nameComparator =(e1,e2)->e1.getFirstName().compareTo(e2.getFirstName());
		List<Employee> e=(List<Employee>) elist.stream().sorted(nameComparator).collect(Collectors.toList());
		return e;
	}
	
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
	
	public List<Employee> sortDeptId(List<Employee> elist)
	{
		Comparator<Employee> DeptidComparator = (o1, o2) ->
		{
			int x=o1.getDep().getDepartmentId();
			int y=o2.getDep().getDepartmentId();
			if(x==y)
				return 0;
			else if(x>y)
				return 1;
			return -1;
		};
		List<Employee> e=elist.stream().sorted(DeptidComparator).collect(Collectors.toList());
		return e;
	}
	
	
	
	
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
