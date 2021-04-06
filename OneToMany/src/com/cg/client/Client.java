package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Department;
import com.cg.entity.Employee;

public class Client 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee e1=new Employee();
		e1.setEmpId(3);
		e1.setName("ravi");
		e1.setSalary(34000);
		
		Employee e2=new Employee();
		e2.setEmpId(4);
		e2.setName("ram");
		e2.setSalary(46000);
		
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e2);
		
		Department d1=new Department();
		d1.setDeptId(100);
		d1.setDeptname("hr");
		d1.setEmployee(emplist);
		
		//employees are persisted automatically on persisting the department object
		em.persist(d1);
		
		em.getTransaction().commit();
		System.out.println("Record Inserted");
	}

}
