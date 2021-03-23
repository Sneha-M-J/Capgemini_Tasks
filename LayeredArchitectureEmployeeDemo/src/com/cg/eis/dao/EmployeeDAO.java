package com.cg.eis.dao;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.cg.eis.bean.Employee;
import com.cg.eis.util.EmployeeRepo;

public class EmployeeDAO implements IEmployeeDAO
{
	@Override
	public double getSumSal(List<Employee> elist)
	{
		double sum=0;
		for(Employee e:elist)
		{
			sum+=e.getSalary();
		}
		return sum;
		//return elist.stream().collect(Collectors.sumingDouble());
		
	}

	@Override
	public List<Employee> sortByName(List<Employee> elist) 
	{
		List<Employee> sorted=elist.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		return sorted;
	}

	EmployeeRepo er=new EmployeeRepo();
	@Override
	public Employee findById(int id) 
	{
		List<Employee> emp=er.getEmployees();
		for(Employee e:emp)
		{
			if(e.getEmpid()==id)
				return e;
		}
		return null;
	}
	
	
	
	
}
