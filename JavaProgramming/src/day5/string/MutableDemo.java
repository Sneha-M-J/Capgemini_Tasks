package day5.string;

public class MutableDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("sb = "+sb);
		sb.append("Welcome");
		System.out.println("sb = "+sb);
	}

}
