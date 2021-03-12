package day6.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuantifierDemo 
{
	public static void main(String[] args) 
	{
		String str="abaabaaa";
		System.out.println("String is : "+str);
		
		Matcher m1=Pattern.compile("a").matcher(str);
		System.out.println("=======m1  a======");
		while(m1.find()) 
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());	
		}
		
		System.out.println("=======m2  a+======");
		Matcher m2=Pattern.compile("a+").matcher(str);
		while(m2.find()) 
		{
			System.out.println(m2.start()+" "+m2.end()+" "+m2.group());			
		}
		
		System.out.println("=======m3  a*======");
		Matcher m3=Pattern.compile("a*").matcher(str);
		while(m3.find()) 
		{
			System.out.println(m3.start()+" "+m3.end()+" "+m3.group());			
		}
		
		System.out.println("=======m4  a?======");
		Matcher m4=Pattern.compile("a?").matcher(str);
		while(m4.find()) 
		{
			System.out.println(m4.start()+" "+m4.end()+" "+m4.group());			
		}
		
	}

}
