package day7.map;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//Lab 6 Exercise 1 Assignment
public class Demo 
{
	List getValues(HashMap<Integer,Integer> h)
	{
		List l=new ArrayList<>();
		for(Integer Values : h.values()) 
		{
			l.add(Values);
		}
		Collections.sort(l); //only values are sorted
		return l;
	}
	
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(1, 10);
		hm.put(2, 15);
		hm.put(3, 5);
		
		Demo d=new Demo();
		List mysortedList=d.getValues(hm);
		System.out.println(mysortedList);
	}

}
