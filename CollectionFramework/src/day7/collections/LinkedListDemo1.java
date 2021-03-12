package day7.collections;

import java.util.LinkedList;

public class LinkedListDemo1 
{

	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(1);
		l.add(2);
		l.addFirst(30);
	    l.addLast(40); //works similar to add
	    System.out.println(l);    
	}

}
