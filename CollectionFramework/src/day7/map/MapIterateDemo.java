package day7.map;

import java.util.HashMap;
import java.util.Map;

public class MapIterateDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("Sachin", "He is batsman");
		hm.put("Rahul", "He is wicket keeper batsman");
		hm.put("Bumrah", "He is bowler");
		System.out.println("Initial HashMap : "+hm);
		
		System.out.println("======keys========");
		for(String key : hm.keySet())
		{
			System.out.println("Keys are "+key);
			//System.out.println("Values are "+hm.get(key));  //to get values
		}
		
		System.out.println("======values========");
		for(String val: hm.values())
		{
			System.out.println(val);
		}
		
		System.out.println("======Both key and values========");
		for(Map.Entry<String,String> h : hm.entrySet())
		{
			System.out.println(h);
		}
		
		System.out.println("======Both key and values for a particular key========");
		for(Map.Entry<String,String> h1 : hm.entrySet())
		{
			if(h1.getKey()=="Sachin")
			   System.out.println(h1);
		}
	}

}
