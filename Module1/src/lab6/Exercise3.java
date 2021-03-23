package lab6;

import java.util.HashMap;

public class Exercise3 
{
	HashMap<Integer,Integer> getSquares(int num[])
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int len=num.length;
		for(int i=0;i<len;i++)
		{
			hm.put(num[i], num[i]*num[i]);
		}
		return hm;
	}
	
	public static void main(String[] args) 
	{
		int num[]= {11,2,3,17,20,21};
		Exercise3 obj=new Exercise3();
		HashMap<Integer,Integer> hm=obj.getSquares(num);
		System.out.println(hm);
	}

}
