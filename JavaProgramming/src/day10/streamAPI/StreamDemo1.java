package day10.streamAPI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Refer Employee class
public class StreamDemo1
{
	public static void main(String args[])
	{
		ArrayList<Employee> emplist =new ArrayList<Employee>();
		emplist.add(new Employee(1,"sachin","Hr",45000,32));
		emplist.add(new Employee(2,"ravi","Developer",85000,32));
		emplist.add(new Employee(3,"kumar","Developer",50000,33));
		emplist.add(new Employee(4,"rahul","Hr",25000,26));
		emplist.add(new Employee(5,"manish","Manager",9000,32));
		
		System.out.println("Emplist: "+emplist);
		System.out.println();
	
		//display emplist using forEach loop
		emplist.forEach(s->System.out.println(s));
		System.out.println();
		
		//display only employee age
		emplist.forEach(s1->System.out.println(s1.getAge()));
		System.out.println();
		
		//display emplist using method reference
		System.out.println("By using Method Reference");
		emplist.forEach(System.out::print);
		System.out.println();
		System.out.println();
		
		//=====STREAM METHODS=====
		//count method to count no of employees
		System.out.println("=====Count of Employees=====");
		long empcount=emplist.stream().count();
		System.out.println(empcount);
		System.out.println();
		
		//filter method to display only developers
		System.out.println("===Display only developer===");
		emplist.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).forEach(s->System.out.println(s));
		System.out.println();
		
		//filter method to display only developers names
		System.out.println("===Display only developer names===");
		emplist.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).forEach(s->System.out.println(s.getName()));
		System.out.println();
				
		//use filter and count to display no of developers
		System.out.println("===Display only developer count===");
		long count1=emplist.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).count();	
		System.out.println(count1);
		System.out.println();
		
		//display name with length
		//use map because we want length of every name 
		System.out.println("====Name length====");
		emplist.stream().map(e->e.getName()+" "+e.getName().length()+" "+e.getDept()).forEach(s->System.out.println(s));
		System.out.println();
		
		//display old salary and incremented salary for every employee (so use map)
		System.out.println("====Increment salary by 10%====");
		emplist.stream().map(e->e.getName()+" "+e.getSalary()+" "+e.getSalary()*1.1).forEach(s->System.out.println(s));
		System.out.println();
		
		//display sum of all employee salaries (so use map)
		System.out.println("====Total Employee salary====");
		int totalsal=emplist.stream().mapToInt(e->e.getSalary()).sum();
		System.out.println(totalsal);
		System.out.println();
		
		//display total developer salary
		//use filter to get only developers. Then use map to add their salaries
		System.out.println("====Total Developer salary====");
		int developsal=emplist.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).mapToInt(s->s.getSalary()).sum();
		System.out.println(developsal);
		System.out.println();
		
		//make a list consisting of employees whose name starts with "r"
		//collect() is used to collect result in a list
		List<Employee> emp=emplist.stream().filter(s->s.getName().startsWith("r")).collect(Collectors.toList());
		emp.forEach(s->System.out.println(s));
		System.out.println();
		
		//display all employee details except developer
		System.out.println("===Display all except developer===");
		List<Employee> empNoDevelop=emplist.stream().filter(s->s.getDept()!="Developer").collect(Collectors.toList());
		empNoDevelop.forEach(s->System.out.println(s));
		//emplist.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).forEach(s->System.out.println(s));
		System.out.println();
		
		
	}
}