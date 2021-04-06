package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Address;
import com.cg.entity.Employee;

public class Client 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Address ad=new Address();
		ad.setAddressId(100);
		ad.setStreetName("btm");
		ad.setPincode(75665);
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("rahul");
		e1.setDesignation("hr");
		e1.setSalary(45000);
		e1.setAddress(ad);
		
		//we persist only employee obj and address obj gets persisted automatically (due to cascade)
		em.persist(e1);
		System.out.println("Record inserted successfully");
				
		em.getTransaction().commit();
	}

}
