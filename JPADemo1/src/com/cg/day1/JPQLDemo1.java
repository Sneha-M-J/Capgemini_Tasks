package com.cg.day1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class JPQLDemo1 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		//jpql query  (Query is an interface)
		//1. Retrieve records 
		System.out.println("Using Query");
		Query q1=em.createQuery("select s from Student s");
		List<Student> l=q1.getResultList();
		System.out.println(l);  //implement toString() in Student class to format the output
        System.out.println();
        
        //2.iterate through the list
		System.out.println("Iterating the list");
		for(Student s:l)
		{
			System.out.println(s.getId()+" "+s.getDept()+" "+s.getName());	
		}
		System.out.println();
		  
		//3.Typed Query
		System.out.println("=========================");
		System.out.println("Using Typed Query");
		TypedQuery<Student> q2=em.createQuery("select s from Student s",Student.class);
		List<Student> l2=q2.getResultList();
		System.out.println(l2); 
		em.getTransaction().commit();
		//em.close();
	}

}
