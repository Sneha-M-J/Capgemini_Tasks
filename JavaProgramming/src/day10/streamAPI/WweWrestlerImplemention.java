package day10.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WweWrestlerImplemention
{
	public static void main(String[] args) 
	{
		ArrayList<WweTask> wlist=new ArrayList<WweTask>();
		wlist.add(new WweTask("srujan","raj",148));
		wlist.add(new WweTask("sachin","singh",169));
		wlist.add(new WweTask("raju","varma",201));
		wlist.add(new WweTask("ram","AB",178));
		wlist.add(new WweTask("anil","MJ",250));
		
		System.out.println("===1.Count no of wrestlers===");
		long countw=wlist.stream().count();
		System.out.println(countw);
		System.out.println();
		
		System.out.println("===2.Sum of weights where weight>200");
		int totalw=wlist.stream().filter(e->e.getWeight()>200).mapToInt(s->s.getWeight()).sum();
		System.out.println(totalw);
		System.out.println();
		
		System.out.println("===3.List consisting of all wrestler's first name");
		List<String> ww=wlist.stream().map(e->e.getFirstName()).collect(Collectors.toList());
		System.out.println(ww);
		System.out.println();
	}

}
