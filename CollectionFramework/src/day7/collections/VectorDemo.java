package day7.collections;

import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) 
	{
		Vector<Integer> o1=new Vector<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		System.out.println("elements of o1 : "+o1);
		System.out.println(o1.capacity());
	}

}
