package day10.streamAPI;

import java.util.ArrayList;

public class StreamDemo2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(3);
		num.add(10);
		num.add(24);
		num.add(5);
		num.forEach(x->System.out.println(x));
		System.out.println("After Sorting");
		//can use sorted because Integer (Wrapper class) implements comparable interface
		num.stream().sorted().forEach(x->System.out.println(x));
		System.out.println();
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("sachin");
		names.add("rohit");
		names.add("anand");
		names.add("ankit");
		names.forEach(x->System.out.println(x));
		System.out.println("After Sorting");
		names.stream().sorted().forEach(x->System.out.println(x));
		System.out.println();
		
		
	}

}
