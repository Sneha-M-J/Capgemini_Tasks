package com.cg.eis.bean;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee 
{
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate localDate;
	private String designation;
	private double salary;
	private Integer managerId;
	private Department dep;

 public Employee() {

 // TODO Auto-generated constructor stub

 }

 public Employee(Integer employeeId, String firstName, String lastName, String email, String phoneNumber,
		LocalDate localDate, String designation, double salary, Integer managerId, Department dep) 
 {
super();

this.employeeId = employeeId;
this.firstName = firstName;
this.lastName = lastName;
this.email = email;
this.phoneNumber = phoneNumber;
this.localDate = localDate;
this.designation = designation;
this.salary = salary;
this.managerId = managerId;
this.dep = dep;
}

public Integer getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(Integer employeeId) {
this.employeeId = employeeId;
}

public String getFirstName() {
return firstName;
}

public void setFirstName(String firstName) {
this.firstName = firstName;
}

public String getLastName() {
return lastName;
}

public void setLastName(String lastName) {
this.lastName = lastName;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getPhoneNumber() {
return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
this.phoneNumber = phoneNumber;
}

public LocalDate getLocalDate() {
return localDate;
}

public void setLocalDate(LocalDate localDate) {
this.localDate = localDate;
}

public String getDesignation() {
return designation;
}

public void setDesignation(String designation) {
this.designation = designation;
}

public double getSalary() {
return salary;
}

public void setSalary(double salary) {
this.salary = salary;
}

public Integer getManagerId() {
return managerId;
}

public void setManagerId(Integer managerId) {
this.managerId = managerId;
}

public Department getDep() {
return dep;
}

public void setDep(Department dep) {
this.dep = dep;
}

@Override

public String toString() 
{

 return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="

  + email + ", phoneNumber=" + phoneNumber + ", localDate=" + localDate + ", designation=" + designation

  + ", salary=" + salary + ", managerId=" + managerId + ", dep=" + dep + "]";

 }
}
