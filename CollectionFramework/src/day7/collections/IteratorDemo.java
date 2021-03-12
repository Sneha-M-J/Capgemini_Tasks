package day7.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo 
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
		
		Iterator<Integer> it=o1.iterator();
		while(it.hasNext())
		{
			int num=it.next();
			if(num<3)
			{
				it.remove();
				System.out.println(num);
			}
		}
		System.out.println("elements " +o1);
	}

}
