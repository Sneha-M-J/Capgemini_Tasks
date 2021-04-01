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
		
		Query q=em.createNamedQuery("findAll");
		List l=q.getResultList();
		System.out.println("List "+l);
		
		//REFER JPQLQueries FOR BETTER UNDERSTANDING
		//find by id using Query
		System.out.println("=====find by id=====");
		Query q1=em.createNamedQuery("findById").setParameter("id",2);
		Student s=(Student)q1.getSingleResult();
		System.out.println(s.getId()+" "+s.getName()+" "+s.getDept());
		
		//find by id using TypedQuery
		TypedQuery<Student> q2=em.createNamedQuery("findById",Student.class).setParameter("id",4);
		Student s2=q2.getSingleResult();
		System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getDept());
		
		em.getTransaction().commit();
	}

}
