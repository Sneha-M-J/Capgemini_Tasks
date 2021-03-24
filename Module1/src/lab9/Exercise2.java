package lab9;

import java.util.Scanner;

interface AddSpace
{
	abstract String add(String str);
}

public class Exercise2 
{
	public static void main(String[] args)
	{
		AddSpace a=(str)->
		{
			StringBuffer sb=new StringBuffer("");
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				sb.append(ch);
				sb.append(' ');
			}
			String res=sb.toString();
			return res;
		};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println(a.add(s));
	}

}
