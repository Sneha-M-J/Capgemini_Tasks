package day7.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) 
	{
		HashSet s=new HashSet();
		s.add(3);
		s.add(3);
		s.add(45);
		s.add("hello");
		s.add("hello");
		s.add(100);
		System.out.println(s);
		
		LinkedHashSet l=new LinkedHashSet();
		l.add("hi");
		l.add("hello");
		l.add("hi");
		l.add(45);
		l.add(100);
		l.add("Thank you");
		System.out.println(l);
		
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(5);
		t.add(20);
		System.out.println(t);
	}

}
