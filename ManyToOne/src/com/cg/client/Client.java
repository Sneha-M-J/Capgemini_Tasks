package com.cg.client;

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
		
		Department d1=new Department();
		d1.setDeptId(100);
		d1.setDeptname("hr");
		
		Employee e1=new Employee();
		e1.setEmpId(1);
		e1.setName("suresh");
		e1.setSalary(46000);
		e1.setDepartment(d1);
		
		Employee e2=new Employee();
		e2.setEmpId(2);
		e2.setName("mahesh");
		e2.setSalary(52000);
		e2.setDepartment(d1);
		
		//when we persist employee object, department object automatically get persisted
		em.persist(e1);
		em.persist(e2);
		
		em.getTransaction().commit();
		System.out.println("Record Inserted");
	}

}
