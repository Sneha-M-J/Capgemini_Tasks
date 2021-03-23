package com.cg.eis.bean;

public class Employee 
{
	private int empid;
	private String name;
	private double salary;
	private String designation;
	private String manager;
	
	public Employee(int empid, String name, double salary, String designation, String manager) 
	{
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.manager = manager;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() 
	{
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", manager=" + manager + "]";
	}
	
	
}
