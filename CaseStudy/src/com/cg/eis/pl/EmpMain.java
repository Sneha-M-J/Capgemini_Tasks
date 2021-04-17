package com.cg.eis.pl;

import com.cg.eis.service.*;

import java.util.List;

import com.cg.eis.bean.*;

public class EmpMain {

 public static void main(String[] args) {

 EmployeeService es=new EmployeeService();
 List<Employee> elist=EmployeeRepository.getEmployees();
 List<Department> dlist=EmployeeRepository.getDepartments();
 
 System.out.println("----------1.Sum of the Salary----------");
 System.out.println(es.getSumOfSalary(elist));
 System.out.println();
 
 System.out.println("----------2.Department Name And Employee Count----------");
 es.departmentNameAndEmployeeCount(elist,dlist);
 System.out.println();
 
 System.out.println("----------3.Senior Most Employee----------");
 es.seniorMostEmployee(elist);
 System.out.println();
 
 System.out.println("----------4.Employee Name And Duration Of Service----------");
 es.nameAndDurationOfService(elist);
 System.out.println();
 
 System.out.println("\n----------5.Employee without dept----------");
 List<Employee> el2=es.getEmployeeWithoutDept(elist);
 for(Employee e:el2)
 System.out.println(e);
 System.out.println();
 
 System.out.println("----------6.Departments Without Employees----------");
 es.departmentsWithoutEmployees(elist,dlist);
 System.out.println();
 
 System.out.println("----------7.Department With Highest Count Of Employees----------");
 es.departmentWithHighestCount(elist,dlist);
 System.out.println();
 
 System.out.println("---------8.List Employee Name, Hire Date and Day Of Week on which Employee started----------");
 es.employeeNameHireDate(elist);
 System.out.println();
 
 System.out.println("---------9.List Employee Name, Hire Date and Day Of Week for Employee started on Friday----------");
 es.employeeNameHireDateFriday(elist);
 System.out.println();
 
 System.out.println("---------10.Employee Name and Manager to whom he/she reports----------");
 es.employeeReportsTo(elist);
 
 System.out.println("\n------------11.Employee salary increased by 15%----------");
 List<String> el4=es.getSalInc(elist);
 for(String e:el4)
 System.out.println(e);

 System.out.println("\n----------12.Employee without manager----------");
 List<Employee> el3=es.didnotHaveManager(elist);
 for(Employee e:el3)
 System.out.println(e);
 System.out.println();
 
 System.out.println("---------13.Accept Manager name and print his/her sub Ordinates----------");
 es.findSubOrdinates(elist,"Ram","Kumar");
 
 System.out.println("\n-------------14. i.List sorted by Employee id----------");
 List<Employee> el6=es.sortEmpId(elist);
 for(Employee e: el6)
 System.out.println(e);
 
 System.out.println("\n-------------14. ii. List sorted by First Name----------");
 List<Employee> el5=es.sortName(elist);
 for(Employee e: el5)
 System.out.println(e);

 System.out.println("\n-------------14. iii.List sorted by Department id----------");
 List<Employee> el7=es.sortDeptId(elist);
 for(Employee e: el7)
 System.out.println(e);
 
}

}