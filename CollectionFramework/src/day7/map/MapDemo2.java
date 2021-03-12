package day7.map;

import java.util.HashMap;

public class MapDemo2 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("Sachin", "He is batsman");
		hm.put("Rahul", "He is wicket keeper batsman");
		hm.put("Bumrah", "He is bowler");
		System.out.println("Initial HashMap : "+hm);
		
		hm.replace("Sachin","He is retired"); // value for key is replaced
		System.out.println("HashMap after replace : "+hm);
		
		hm.put("Rahul", "He is a mentor"); //similar to replace (overwrites the value)
		System.out.println("HashMap after put : "+hm);
		
		hm.remove("Bumrah"); //removes the key value pair
		System.out.println("HashMap after remove : "+hm);
	}

}
