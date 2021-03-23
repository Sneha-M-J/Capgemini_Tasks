package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise6 
{
	List<Integer> votersList(HashMap<Integer,Integer> hm)
	{
		List<Integer> l=new ArrayList<Integer>();
		for(Integer key:hm.keySet())
		{
			Integer val=hm.get(key);
			if(val>18)
				l.add(key);
		}
		return l;		
	}
	
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		hm.put(1000, 19);
		hm.put(1001, 10);
		hm.put(1002, 60);
		hm.put(1003, 7);
		Exercise6 obj=new Exercise6();
		List<Integer> l=obj.votersList(hm);
		System.out.println(l);
	}

}
