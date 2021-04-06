package com.cg.day1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentClient 
{
	public static void main(String args[])
	{
		//EntityManagerFactory establish a connection with database and manages all entities
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		//EntityManager handles memory allocation for all transactions
		EntityManager em=emf.createEntityManager();
	    
		em.getTransaction().begin();  //begins the transaction
		
		//Persistence life cycle
		//1.New state : when java object is created but database row is not yet created
	    Student s=new Student();  
	    s.setId(3);  //give unique values everytime
	    s.setName("sneha");
	    s.setDept("cse");
	    
	    //2.Managed state : a database row is created
	    em.persist(s);    //it will make one row in the database
	    System.out.println("record inserted...");
	    
	    //3.Removed state : when we remove a database row
	    //em.remove(s);  //deletes a row
	    em.getTransaction().commit();   //for saving permanently
	    
	    //4.Detached state : closing the connection
	    //em.close();  //once closed we cannot insert new row
	}
}
