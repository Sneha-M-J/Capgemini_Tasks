package com.cg.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Client 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pun");
		EntityManager em=emf.createEntityManager();
		
		//create
		em.getTransaction().begin();
		System.out.println("=====Insert Record=====");
		Author a=new Author();
		a.setAuthorId(2);    //change id everytime before running
		a.setFirstName("sneha");
		a.setMiddleName("M");
		a.setLastName("J");
		a.setPhoneNo("8861734383");
		em.persist(a);
		System.out.println("=====Record Inserted=====");
		Query q1=em.createQuery("select au from Author au");
		List l1=q1.getResultList(); 
		System.out.println("l1 : "+l1);
		System.out.println();
		em.getTransaction().commit();

		
		//update
		em.getTransaction().begin();
		System.out.println("=====Update Record=====");
		Author auth=em.find(Author.class, 2);
		if(auth!=null)
		{
			auth.setFirstName("Srujan");
			auth.setMiddleName("kupi");
			auth.setLastName("M J");
			auth.setPhoneNo("8217034066");
		}
		else
		{
			System.out.println("No value found");
		}
		System.out.println("=====Record Updated=====");
		Query q2=em.createQuery("select au from Author au");
		List l2=q2.getResultList(); 
		System.out.println("l2 : "+l2);
		System.out.println();
		em.getTransaction().commit();
		
		
		//delete
		em.getTransaction().begin();
		System.out.println("=====Delete Record=====");
		Author auth1=em.find(Author.class, 2);
		if(auth1!=null)
		{
			em.remove(auth1);
			System.out.println("delete successfull");
		}
		else
		{
			System.out.println("No value found");
		}
		System.out.println("=====Record Deleted=====");
		Query q3=em.createQuery("select au from Author au");
		List l3=q3.getResultList(); 
		System.out.println("l3 : "+l3);
		System.out.println();
		em.getTransaction().commit();
	}

}
