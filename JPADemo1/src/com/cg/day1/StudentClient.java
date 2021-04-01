package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentClient 
{
	public static void main(String args[])
	{
		//establish a connection with database and manages all entities
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		EntityManager em=emf.createEntityManager();
	    
		em.getTransaction().begin();  //begins the transaction
	    Student s=new Student();  //new state
	    s.setId(3);  //give unique values everytime
	    s.setName("sneha");
	    s.setDept("cse");
	    //it will make one row in the database
	    em.persist(s);    //managed state
	    System.out.println("record inserted...");
	    
	    //em.remove(s);  //deletes a row
	    em.getTransaction().commit();   //for saving permanently
	    //em.close();  //once closed we cannot insert new row
	}
}
