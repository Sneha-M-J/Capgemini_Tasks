package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTransactionDemo
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		EntityManager em=emf.createEntityManager();
	    
		//here we are defining 2 different transactions
		//1st transaction
		em.getTransaction().begin();  
	    Student s=new Student();  
	    s.setId(4);  
	    s.setName("sneha");
	    s.setDept("cse");
	    em.persist(s);    
	    System.out.println("record inserted...");
	    em.getTransaction().commit();   
	    
	    //2nd transaction
	    em.getTransaction().begin();  
	    Student s1=new Student();
	    s1.setId(5);  
	    s1.setName("shreya");
	    s1.setDept("cse");
	    em.persist(s1);    
	    System.out.println("record inserted...");
	    em.getTransaction().commit();  
	    
	    //if we have both operations within same transaction and if any 1 operation fails, all the transactions are rolled back
	    //so it is better to keep different transactions differently 
	}

}
