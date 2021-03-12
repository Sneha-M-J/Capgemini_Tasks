package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> o1=new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		System.out.println("elements " +o1);
		
		ListIterator<Integer> it=o1.listIterator();
		System.out.println("Forward");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Backward");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
	}

}
