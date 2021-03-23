package lab6;

import java.util.HashMap;

public class Exercise4 
{
	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> ihm)
	{
		HashMap<Integer,String> ohm=new HashMap<Integer,String>();
		for(Integer key:ihm.keySet())
		{
			int val=ihm.get(key);
			if(val>=90)
				ohm.put(key, "Gold");
			else if(val>=80)
				ohm.put(key, "Silver");
			else if(val>=70)
				ohm.put(key, "Bronze");
			else
				ohm.put(key, "No Medal");
		}
		return ohm;
		
	}
	
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> ihm=new HashMap<Integer,Integer>();
		ihm.put(1001,99);
		ihm.put(1002,87);
		ihm.put(1003,72);
		ihm.put(1004,59);
		ihm.put(1005,91);
		ihm.put(1006,79);
		Exercise4 obj=new Exercise4();
		HashMap<Integer,String> res=obj.getStudents(ihm);
		System.out.println(res);
	}

}
