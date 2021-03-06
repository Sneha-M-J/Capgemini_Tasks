package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Product
{
	int pid;
	String pname;
	float price;
	public Product(int pid, String pname, float price) 
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	public String toString() 
	{
		return "Product [id=" + pid + ", name=" + pname + ", price=" + price + "]";
	}
	
}


public class UserDefinedTask
{
	public static void main(String[] args) 
	{
		ArrayList<Product> pro=new ArrayList<Product>();
		pro.add(new Product(1,"pencil",300));
		pro.add(new Product(2,"pen",100));
		pro.add(new Product(3,"eraser",150));
		pro.add(new Product(4,"sharpner",200));
		pro.add(new Product(5,"glue",350));
		
		//display those products whose price<200
		Iterator<Product> it=pro.iterator();
		while(it.hasNext())
		{
			Product p=it.next();
			if(p.price<200)
			{
				System.out.println(p);
			}			
		}
	}

}
