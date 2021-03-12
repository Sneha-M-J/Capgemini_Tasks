package day6.collections;

import java.util.ArrayList;

public class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList o=new ArrayList();
		System.out.println("before size : "+o.size());
		System.out.println("elements are : "+o);
		o.add(1);
		o.add(10.25);
		o.add("ravi");
		o.add('c');
		o.add(null);
		System.out.println("after size : "+o.size());
		System.out.println("elements are : "+o);
		o.add(2,"hello");
		System.out.println("elements are : "+o);
		o.remove("ravi");
		System.out.println("elements are : "+o);
		o.remove(1);
		System.out.println("elements are : "+o);
		o.remove(Integer.valueOf(1));
		System.out.println("elements are : "+o);
		System.out.println(o.contains("hello"));
		System.out.println(o.contains("sachin"));
		o.add(10);
		o.add(11.23);
		o.add("sru");
		System.out.println("elements are : "+o);
		o.set(4, "raju");
		System.out.println("elements are : "+o);
		System.out.println(o.get(0));
		System.out.println("elements are : "+o);
		o.clear();
		System.out.println("elements are : "+o);
	}

}
