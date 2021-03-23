package classTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StudentStreamDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(new Student(1,"sneha","cse",95));
		slist.add(new Student(2,"shreya","cse",65));
		slist.add(new Student(3,"srujan","ise",85));
		slist.add(new Student(4,"chitra","cse",45));
		
		long c=slist.stream().filter(e->e.getDept().equalsIgnoreCase("cse")).count();
		System.out.println(c);
		
		System.out.println("Sort by name in ascending order");   //using comparator interface
		Comparator<Student> nameComparator =(e1,e2)->e1.getName().compareTo(e2.getName());
		slist.stream().sorted(nameComparator).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("Sort by name in descending order");   //using comparator interface
		Comparator<Student> nameComparator1 =(e1,e2)->e1.getName().compareTo(e2.getName());
		slist.stream().sorted(nameComparator1.reversed()).forEach(s->System.out.println(s));
		System.out.println();
		
		System.out.println("List of students having marks>50");
		List<Student> mar=slist.stream().filter(s->s.getMarks()>50).collect(Collectors.toList());
		System.out.println(mar);
	}

}
