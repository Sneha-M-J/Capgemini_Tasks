package classTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class PositiveStream 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>(Arrays.asList(4,7,-45,-23,2,23,11,-87));
		ArrayList<Integer> res=(ArrayList<Integer>) a.stream().filter(e->e>0).collect(Collectors.toList());
		System.out.println(res);
	}

}
