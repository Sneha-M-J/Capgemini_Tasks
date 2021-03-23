package com.cg.eis.util;

import java.util.ArrayList;
import java.util.List;
import com.cg.eis.bean.Employee;

public class EmployeeRepo 
{
	public List<Employee> getEmployees()
	{
		List<Employee> emplist=new ArrayList<>();
		emplist.add(new Employee(1, "John", 12000, "System Associate", null));
        emplist.add(new Employee(2, "Paul", 4000, "Programmer", "Mr. X"));
        emplist.add(new Employee(3, "Vinay", 55000, "Manager", "Mr. Y"));
        emplist.add(new Employee(4, "Krishna", 12000, "System Associate", null));
        emplist.add(new Employee(5, "Smriti", 2000, "Clerk", "My. Z"));
        emplist.add(new Employee(6, "Singh", 12000, "Clerk", "Mr. X"));
        emplist.add(new Employee(7, "Ram", 17000, "System Associate", "Mr. X"));
        emplist.add(new Employee(8, "Ramesh", 25000, "Programmer", "Mr. Y"));
        emplist.add(new Employee(9, "Rahul", 42000, "Manager", "Mr. Z"));
        emplist.add(new Employee(10, "Suman", 19000, "System Associate", null));
        return emplist;
		
	}
}
