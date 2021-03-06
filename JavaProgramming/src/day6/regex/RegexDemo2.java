package day6.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 
{
	public static void main(String[] args) 
	{
		String str="Hello123@ java";
		System.out.println("String is : "+str);
		
		Matcher m1=Pattern.compile("[ace]").matcher(str);
		System.out.println("=======m1  [ace]======");
		while(m1.find()) 
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());	
		}
		
		System.out.println("=======m2  [^abc]======");
		Matcher m2=Pattern.compile("[^abc]").matcher(str);
		while(m2.find()) 
		{
			System.out.println(m2.start()+" "+m2.end()+" "+m2.group());			
		}
		
		System.out.println("=======m3  [a-z]======");
		Matcher m3=Pattern.compile("[a-z]").matcher(str);
		while(m3.find()) 
		{
			System.out.println(m3.start()+" "+m3.end()+" "+m3.group());			
		}
		
		System.out.println("=======m4  \\w======");
		Matcher m4=Pattern.compile("[\\w]").matcher(str);
		while(m4.find()) 
		{
			System.out.println(m4.start()+" "+m4.end()+" "+m4.group());			
		}
		
		System.out.println("=======m5  \\d======");
		Matcher m5=Pattern.compile("[\\d]").matcher(str);
		while(m5.find()) 
		{
			System.out.println(m5.start()+" "+m5.end()+" "+m5.group());			
		}
		
		System.out.println("=======m6  \\s======");
		Matcher m6=Pattern.compile("[\\s]").matcher(str);
		while(m6.find()) 
		{
			System.out.println(m6.start()+" "+m6.end()+" "+m6.group());			
		}
	}

}
