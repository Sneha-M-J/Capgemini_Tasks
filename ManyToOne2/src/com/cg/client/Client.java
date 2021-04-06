package com.cg.client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Employee;
import com.cg.entity.Manager;

public class Client 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Manager m1=new Manager();
		m1.setManId(100);
		m1.setName("hari");
		m1.setDept("hr");
		
		Employee e1=new Employee();
		e1.setEmpId(3);
		e1.setName("ravi");
		e1.setManager(m1);
		
		Employee e2=new Employee();
		e2.setEmpId(4);
		e2.setName("ram");
		e2.setManager(m1);
		
		em.persist(e1);
		em.persist(e2);
		
		em.getTransaction().commit();
		System.out.println("Record Inserted");
	}

}
