package day6.collections;

import java.util.ArrayList;

public class CollectionMethodsTask 
{
	public static void main(String[] args) 
	{
		ArrayList<String> project1=new ArrayList<String>();
		project1.add("Sachin");
		project1.add("Rahul");
		project1.add("Amit");
		project1.add("Kumar");
		
		ArrayList<String> project2=new ArrayList<String>();
		project2.add("Roshan");
		project2.add("Varsha");
		project2.add("Rahul");
		project2.add("Amit");
		project2.add("Harshit");
		
		//remove duplicate names and print only once
		project2.removeAll(project1); //removes ele of p1 from p2
		project2.addAll(project1);  //get everyone in the same list
		System.out.println(project2);
	}

}
