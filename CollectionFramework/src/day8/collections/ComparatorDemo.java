package day8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}	
}

//have separate comparator classes for every member
class IdComparator implements Comparator<Student>
{
    //ascending order
	@Override
	public int compare(Student o1, Student o2) 
	{
		if(o1.id==o2.id)
			return 0;
		else if(o1.id>o2.id)
			return 1;
		return -1;
	}	
}

class NameComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.name.compareTo(o2.name);
	}	
}

class MarksComparator implements Comparator<Student>
{
	@Override
	public int compare(Student o1, Student o2) 
	{	
		//descending order
		if(o1.marks==o2.marks)
			return 0;
		else if(o1.marks>o2.marks)
			return -1;
		return 1;
	}	
}

public class ComparatorDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> st=new ArrayList<Student>();
		st.add(new Student(10,"Ram",57));
		st.add(new Student(1,"Sneha",87));
		st.add(new Student(8,"Anil",65));
		
		for(Student s:st)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
		System.out.println("Sorting by id");
		Collections.sort(st, new IdComparator());
		for(Student s:st)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
		System.out.println("Sorting by name");
		Collections.sort(st, new NameComparator());
		for(Student s:st)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
		
		System.out.println("Sorting by marks");
		Collections.sort(st, new MarksComparator());
		for(Student s:st)
		{
			System.out.println(s.id+" "+s.name+" "+s.marks);
		}
	}
}
