package lab6;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise7 
{
	int[] getSorted(int arr[])
	{
		ArrayList<Integer> alist=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			String str=Integer.toString(n);
			StringBuffer sb=new StringBuffer(str);
			sb.reverse();
			String res=sb.toString();
			int m=Integer.parseInt(res);
			alist.add(m);
		}
		Collections.sort(alist);
		int res[]=new int[arr.length];
		int j=0;
		for(int a:alist)
		{
			res[j]=a;
			j++;
		}
		return res;
		
	}
	public static void main(String[] args) 
	{
		int arr[]= {123, 23,11,45,876,267};
		Exercise7 obj=new Exercise7();
		int res[]=obj.getSorted(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(res[i]);
		}
	}

}
