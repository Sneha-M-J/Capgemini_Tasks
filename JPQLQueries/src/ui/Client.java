package ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entity.Product;

public class Client 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
//		Product p1=new Product();
//		p1.setProductId(1);
//		p1.setProductname("laptop");
//		p1.setPrice(45000);
//		em.persist(p1);
//		System.out.println("Inserted");
		//or do insertion in oracle using insert into query
		
		//Using Query
		                     //this is a jpql query and not sql query(so cant use *) instead use objects
		Query q1=em.createQuery("select p from Product p");
		List l1=q1.getResultList(); //returns many rows so use getResultList() and take the result in a list
		System.out.println("l1 : "+l1);
		System.out.println();
		
		//using Named Query (query is defined in the entity class and called here using its name findAll())
		Query q2=em.createNamedQuery("findAll");
		List<Product> l2=q2.getResultList();
		System.out.println("l2 : "+l2);
		System.out.println();
		
		Query q3=em.createNamedQuery("findById2");
		Product p1=(Product) q3.getSingleResult();  //returns only a single row
		System.out.println("p1 : "+p1);
		System.out.println();
		
		//use setParameter() if u use dynamic id's
		Query q4=em.createNamedQuery("findById").setParameter("id",3);
		Product p2=(Product) q4.getSingleResult();  //returns only a single row
		System.out.println("p2 : "+p2.getProductId()+" "+p2.getProductname()+" "+p2.getPrice());
		System.out.println();
		                                                      //if we do this then we dont have to typecast as done above
		TypedQuery<Product> tq5=em.createNamedQuery("findById",Product.class).setParameter("id",3);
		Product p3=tq5.getSingleResult();
		System.out.println("p3 : "+p3.getProductId()+" "+p3.getProductname()+" "+p3.getPrice());
		System.out.println();
		
		System.out.println("=====Aggregate functions=====");                         //because it returns a integer output
		TypedQuery<Integer> tq6=em.createQuery("select max(p.price) from Product p" ,Integer.class);
		Integer max=tq6.getSingleResult();
		System.out.println("max = "+max);
		System.out.println();
		
		//using Native query we can directly give sql queries(using * etc)
		System.out.println("=====Native Query=====");
		Query q7=em.createNativeQuery("select * from product3",Product.class);
		List<Product> l7=q7.getResultList();
		System.out.println(l7);
		for(Product pro:l7 )
		{
			System.out.println("pro : "+pro.getProductId()+" "+pro.getProductname()+" "+pro.getPrice());			
		}
		System.out.println();
		
		//define a named query to return those products whose price > 20000
		System.out.println("=====Named Query for price>20000=====");
		Query q8=em.createNamedQuery("findByPrice").setParameter("price",20000);
		List<Product> l8=q8.getResultList();
		System.out.println(l8);
		System.out.println();
		
		em.getTransaction().commit();
	}

}
