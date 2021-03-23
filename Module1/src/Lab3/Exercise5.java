package Lab3;

import java.util.Scanner;

public class Exercise5 
{
	public void count(String str)
	{
		int len=str.length();
		int w=1;
		int l=1;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')  //or use ascii of space =32
				w++;
			else if(ch=='\n') //or use ascii of enter key=32
			{
				l++;
				w++;
				len--;
			}
		}
		System.out.println("Text is :");
		System.out.println(str);
		System.out.println("Number of characters : "+len);
		System.out.println("Number of words : "+w);
		System.out.println("Number of lines : "+l);
	}
	
	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the text");
//		String str=new String();
//		str=sc.next();
		Exercise5 ex=new Exercise5();
		ex.count("Hello\nHow are u\nI am fine");
		//text should not have unnecessary space at the end of each line
	}

}
