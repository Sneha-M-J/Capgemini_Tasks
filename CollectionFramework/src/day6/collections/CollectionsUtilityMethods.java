package day6.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityMethods 
{
	public static void main(String[] args) 
	{
		ArrayList<String> project1=new ArrayList<String>();
		project1.add("Sachin");
		project1.add("Rahul");
		project1.add("Amit");
		project1.add("Kumar");
		System.out.println("Project1 : "+project1);
		
		Collections.sort(project1);
		System.out.println("Project1 after sorting: "+project1);
		
		Collections.reverse(project1);
		System.out.println("Project1 after reversing: "+project1);
		Collections.reverse(project1);
		System.out.println("Project1 after reversing again: "+project1);
		
		//Elements should be in sorted (ascending) order
		int index=Collections.binarySearch(project1, "Sachin"); 
		System.out.println("Element found at: "+index);
		
		int index1=Collections.binarySearch(project1, "Sneha");
		System.out.println("Element found at: "+index1);
		
		
		ArrayList<Integer> o1=new ArrayList<Integer>();
		o1.add(3);
		o1.add(4);
		o1.add(102);
		o1.add(101);
		o1.add(100);
		System.out.println("Element of o2 : "+o1);
		int min=Collections.min(o1);
		System.out.println("Minimun : "+min);
		int max=Collections.max(o1);
		System.out.println("Maximum : "+max);
		
		
	}

}
