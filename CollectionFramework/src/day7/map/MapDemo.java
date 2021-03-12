package day7.map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo 
{
	public static void main(String[] args) 
	{
		//own order
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("Sachin", "He is batsman");
		hm.put("Rahul", "He is wicket keeper batsman");
		hm.put("Bumrah", "He is bowler");
		System.out.println("HashMap : "+hm);
		
		//maintains insertion order
		LinkedHashMap<String, String> lhm=new LinkedHashMap<String, String>();
		lhm.put("Sachin", "He is batsman");
		lhm.put("Rahul", "He is wicket keeper batsman");
		lhm.put("Bumrah", "He is bowler");
		System.out.println("LinkedHashMap : "+lhm);
		
		//Sorted order
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("Sachin", "He is batsman");
		tm.put("Rahul", "He is wicket keeper batsman");
		tm.put("Bumrah", "He is bowler");
		System.out.println("TreeMap : "+tm);
		
	}

}
