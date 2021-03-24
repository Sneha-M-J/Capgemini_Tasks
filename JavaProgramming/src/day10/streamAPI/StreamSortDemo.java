package day10.streamAPI;

import java.util.ArrayList;
import java.util.Comparator;

//refer Employee class
public class StreamSortDemo
{
	public static void main(String[] args)
	{
		ArrayList<Employee> emplist =new ArrayList<Employee>();
		emplist.add(new Employee(1,"sachin","Hr",45000,32));
		emplist.add(new Employee(2,"ravi","Developer",85000,32));
		emplist.add(new Employee(3,"kumar","Developer",50000,33));
		emplist.add(new Employee(4,"rahul","Hr",25000,26));
		emplist.add(new Employee(5,"manish","Manager",9000,32));
		
		//Sorting user defined data
		//Make ur class Employee implement Comparable interface and write compareTo(o1) method
		emplist.forEach(s->System.out.println(s));
		System.out.println("after sorting by age");   //using comparable interface
		emplist.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		
		//write IdComparator class which implements Comparator interface and override compare(o1,o2) method
		System.out.println("Sort by name");   //using comparator interface
		Comparator<Employee> nameComparator =(e1,e2)->e1.getName().compareTo(e2.getName());
		emplist.stream().sorted(nameComparator).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("Sort by id using lambda expression");    //using comparator interface and lambda expression
		Comparator<Employee> idComparator = (o1, o2) ->
		{
			if(o1.getId() == o2.getId())
				return 0;
			else if(o1.getId() > o2.getId())
				return 1;
			return -1;
		};
		emplist.stream().sorted(idComparator).forEach(s->System.out.println(s));
		System.out.println();
		
//		System.out.println("Sort by id using Comparator class");
//		emplist.stream().sorted(IdComparator).forEach(s->System.out.println(s));
//		System.out.println();
		
	}

}

class IdComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getId() == o2.getId())
			return 0;
		else if(o1.getId() > o2.getId())
			return 1;
		return -1;
	}	
}


