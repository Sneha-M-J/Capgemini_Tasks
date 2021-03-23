package day10.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(11,23,14,5,9,12,12);
		l.stream().forEach(s->System.out.println(s));
		
		System.out.println("===limit to 3 objects===");  
		l.stream().limit(3).forEach(s->System.out.println(s));  //considers only first 3 elements
		
		System.out.println("===skip===");
		l.stream().skip(4).forEach(s->System.out.println(s));   //does not consider first 4 elements
		
		System.out.println("===distinct element===");
		l.stream().distinct().forEach(s->System.out.println(s));  //considers only distinct elements
		
		boolean b=l.stream().allMatch(s->s>10);
		System.out.println("all values are greater than 10 "+b);
	
		boolean b2=l.stream().anyMatch(s->s>10);
		System.out.println("any one value are greater than 10 "+b2);
	
	
	
	}

}
