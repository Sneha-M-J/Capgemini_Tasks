package lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise5 
{
	int getSecondSmallest(int arr[])
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			a.add(arr[i]);
		}
		Collections.sort(a);
		int small=a.get(1);
		return small;
	}
	
	public static void main(String[] args)
	{
		int arr[]= {11,23,3,13,78,45,20};
		Exercise5 obj=new Exercise5();
		int small=obj.getSecondSmallest(arr);
		System.out.println("Second Smallest element is : "+small);
	}

}
