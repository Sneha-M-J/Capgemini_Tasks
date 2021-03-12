package day6.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 
{
	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("a");  //it finds for a
		Pattern p1=Pattern.compile("[abc]");  //it finds either a or b or c
		Matcher m1=p1.matcher("sachin");
		while(m1.find()) 
		{
			System.out.println(m1.start()+" "+m1.end()+" "+m1.group());
		}
	}

}
