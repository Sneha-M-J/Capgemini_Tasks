package classTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample
{
	public static void main(String[] args) 
	{
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Sneha");
		alist.add("Sachin");
		alist.add("Raahul");
		alist.add("Anil");
		
		//count no of strings whose length>5
		System.out.println("No of strings whose length >5");
		long c=alist.stream().filter(a->a.length()>5).count();
		System.out.println(c);
		System.out.println();
		
		//sort in ascending order
		System.out.println("Sort in ascending order");
		alist.stream().sorted().forEach(s->System.out.println(s));
		System.out.println();
		
		//sort in descending order
		System.out.println("Sort in descending order");
		alist.stream().sorted(Collections.reverseOrder()).forEach(s->System.out.println(s));
		System.out.println();
		
		//create a list to store string starting with a
		System.out.println("list of strings starting with a");
		List<String> astr=alist.stream().filter(a->a.startsWith("A")).collect(Collectors.toList());
		System.out.println(astr);
	}

}
