package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 
{
	HashMap<Character, Integer> countChars(char arr[])
	{
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			char ch=arr[i];
			if(hm.containsKey(ch))
			{
				hm.put(ch,hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		return hm;	
	}
	
	public static void main(String[] args) 
	{
		char arr[]= {'a','b','c','a','a','b'};
		Exercise2 obj=new Exercise2();
		HashMap<Character, Integer> hm=obj.countChars(arr);
		System.out.println(hm);
	}

}
