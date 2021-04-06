package com.cg.day1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

//query is written in Student class for named query
public class NamedQueryDemo 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("sa");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		System.out.println("Find All");
		Query q=em.createNamedQuery("findAll");
		List l=q.getResultList();
		System.out.println("List "+l);
		System.out.println();
		
		//REFER JPQLQueries FOR BETTER UNDERSTANDING
		//find by id using Query
		System.out.println("=====find by id using named Query and query=====");
		Query q1=em.createNamedQuery("findById").setParameter("id",2);
		Student s=(Student)q1.getSingleResult();
		System.out.println("Student is : "+s);  //or print as below
		System.out.println(s.getId()+" "+s.getName()+" "+s.getDept());
		System.out.println();
		
		//find by id using TypedQuery
		System.out.println("=====find by id using named Query and typed query=====");
		TypedQuery<Student> q2=em.createNamedQuery("findById",Student.class).setParameter("id",4);
		Student s2=q2.getSingleResult();
		System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getDept());
		
		em.getTransaction().commit();
	}

}
