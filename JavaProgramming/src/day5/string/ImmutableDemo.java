package day5.string;

public class ImmutableDemo 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		System.out.println("s1= "+s1);
		s1.concat("Welcome to java");
		System.out.println("s1= "+s1);
		
		//concatenation can be done by assigning
		s1=s1.concat("welcome");
		System.out.println("s1= "+s1);
	}

}
