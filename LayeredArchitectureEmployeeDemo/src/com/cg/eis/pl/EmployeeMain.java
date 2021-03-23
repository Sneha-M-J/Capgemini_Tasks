package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.util.EmployeeRepo;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		EmployeeRepo er=new EmployeeRepo(); //to access employee data
		List<Employee> employees=er.getEmployees();
		employees.forEach(System.out::println);
		System.out.println("=============");
		System.out.println();
		
		EmployeeServiceImpl es=new EmployeeServiceImpl();
		System.out.println("Total salary :"+es.getsumsal(employees));
		System.out.println("=============");
		System.out.println();
		
		System.out.println("Sort employees based on name");
		List<Employee> emps=es.sortByname(employees);
		for(Employee e:emps)
		{
			System.out.println(e);
		}
		System.out.println("=============");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println(es.findById(id));
		
	}

}
