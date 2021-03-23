package day11.Junit;

import static org.hamcrest.CoreMatchers.startsWith;

public class Calculation 
{
	int add(int a,int b)
	{
		int result=0;   //add nos only if they are positive
		if(a>=0 & b>=0)
			result=a+b;
		return result;
	}
	
	boolean nameTest(String name)   //returns true if name starts with 'a'
	{
		return name.startsWith("a");
	}
	
	boolean palindrome(String str)    //returns true if the string is a palindrome
	{
		StringBuffer sb=new StringBuffer(str);
		String rev=sb.reverse().toString();
		return rev.equals(str);
	}
}
