package com.cg.eis.pl;

import com.cg.eis.service.*;

import java.util.List;

import com.cg.eis.bean.*;

public class EmpMain {

 public static void main(String[] args) {

 EmployeeService es=new EmployeeService();
 List<Employee> elist=EmployeeRepository.getEmployees();
 System.out.println("----------1.Sum of the Salary----------");
 System.out.println(es.getSumOfSalary(elist));
 
 System.out.println("\n----------5.Employee without dept----------");
 List<Employee> el2=es.getEmployeeWithoutDept(elist);
 for(Employee e:el2)
 System.out.println(e);

 System.out.println("\n----------12.Employee without manager----------");
 List<Employee> el3=es.didnotHaveManager(elist);
 for(Employee e:el3)
 System.out.println(e);

 System.out.println("\n------------11.Employee salary increased by 15%----------");
 List<String> el4=es.getSalInc(elist);
 for(String e:el4)
 System.out.println(e);

 System.out.println("\n-------------14.List sorted by First Name----------");
 List<Employee> el5=es.sortName(elist);
 for(Employee e: el5)
 System.out.println(e);

 System.out.println("\n-------------14.List sorted by Employee id----------");
 List<Employee> el6=es.sortEmpId(elist);
 for(Employee e: el6)
 System.out.println(e);

 System.out.println("\n-------------14.List sorted by Department id----------");
 List<Employee> el7=es.sortDeptId(elist);
 for(Employee e: el7)
 System.out.println(e);
 
}

}