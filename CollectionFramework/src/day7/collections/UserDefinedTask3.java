package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Employe
{
	int id;
	String name;
	String dept;
	int salary;
	
	public Employe(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}	
}


public class UserDefinedTask3
{
	//1st method
	//select complete method , right click, source, add element comment
	//this is written for documentation
	/**
	 * @param dept
	 * @param emplist
	 * @return
	 */
	ArrayList<Employe> findByDept(String dept, ArrayList<Employe> emplist)
	{
		ArrayList<Employe> emp=new ArrayList<Employe>();
		Iterator<Employe> itr=emplist.iterator();
		while(itr.hasNext())
		{
			Employe e=itr.next();
			if(e.dept.equals(dept))
			{
				emp.add(e);
			}
		}
        return emp;
	}
	
	
	public static void main(String[] args) 
	{
		ArrayList<Employe> emplist =new ArrayList<Employe>();
		emplist.add(new Employe(1,"ravi","hr",65000));
		emplist.add(new Employe(2,"anil","developer",80000));
		emplist.add(new Employe(17,"suresh","ui",70000));
		emplist.add(new Employe(4,"kumar","developer",95000));
		
		System.out.println("Employe list : "+emplist);
		
		//2nd method : display only developers
		Iterator<Employe> it=emplist.iterator();
		while(it.hasNext())
		{
			Employe e=it.next();
			if(e.dept=="developer")
			{
				System.out.println(e.id+" "+e.name+" "+e.dept+" "+e.salary);
			}
		}
		
		//1st method continued
		UserDefinedTask3 c=new UserDefinedTask3();
		ArrayList<Employe> em=c.findByDept("developer", emplist);
		for(Employe e : em)
		{
			System.out.println(e);
		}
	}

}

