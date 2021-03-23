package com.cg.eis.dao;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface IEmployeeDAO 
{
	public double getSumSal(List<Employee> elist);
	public List<Employee> sortByName(List<Employee> elist);
	public Employee findById(int id);
}
