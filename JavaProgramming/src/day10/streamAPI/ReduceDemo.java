package day10.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(1,2,3,4);
		//takes 2 consecutive values and reduces it to one (add)
		int i=l.stream().reduce((a,b)->a+b).get(); 
		System.out.println(i);
		
		System.out.println("===============");
		List<String> names=Arrays.asList("Hello","welcome","java");
		names.forEach(s->System.out.println(s));
		
		Optional<String> name=names.stream().reduce((a,b)->a.concat(b));
		System.out.println(name);
	}

}
