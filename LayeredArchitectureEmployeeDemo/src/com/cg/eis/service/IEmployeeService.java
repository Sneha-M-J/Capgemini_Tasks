package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeService 
{
	public double getsumsal(List<Employee> elist);
	public List<Employee> sortByname(List<Employee> elist);
	public Employee findById(int id);
}
