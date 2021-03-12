package day7.collections;

import java.util.ArrayList;

public class EnhancedForLoop
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> o1=new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		
		for(Integer i: o1)
		{
			System.out.println(i);
		}
	}

}
