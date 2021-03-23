package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeDAO;
import com.cg.eis.dao.IEmployeeDAO;

public class EmployeeServiceImpl implements IEmployeeService
{
	IEmployeeDAO dao=new EmployeeDAO();
	
	@Override
	public double getsumsal(List<Employee> elist) 
	{
		// calling the methods from dao class
		return dao.getSumSal(elist);
	}

	@Override
	public List<Employee> sortByname(List<Employee> elist) {
		// calling the methods from dao class
		return dao.sortByName(elist);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}
	
}
