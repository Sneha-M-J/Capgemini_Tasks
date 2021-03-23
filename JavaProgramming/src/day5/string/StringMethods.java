package day5.string;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		System.out.println("String is : "+s1);
		System.out.println("Length : "+s1.length());
		System.out.println("charAt(1) : "+s1.charAt(1));
		System.out.println("charAt(4) : "+s1.charAt(4));
		System.out.println("index of e : "+s1.indexOf('e'));
		System.out.println("equals(hello) "+s1.equals("hello"));
		System.out.println("equals(Hello) "+s1.equals("Hello"));
		System.out.println("equalsIgnoreCase(Hello) "+s1.equalsIgnoreCase("Hello"));
		System.out.println("replace "+s1.replace('1','p'));
		System.out.println("substring "+s1.substring(1));
		System.out.println("substring "+s1.substring(1,3));   //string from 1 to 3-1
		
		String s2="    Welcome    ";
		System.out.println("s2 : "+s2+"hi");
		System.out.println("s2 : "+s2.trim()+"hi");
		System.out.println("s1 : "+s1.toUpperCase());
		System.out.println("s1 : "+s1.toLowerCase());
		char ch[]=s1.toCharArray();
		
		String s3="hello welcome java";
		String arr[]=s3.split("\\s");
		for(String s:arr)
		{
			System.out.println(s);
		}
		
	}

}
