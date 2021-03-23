/*
1. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
public String mixString(String a, String b) 
{  }

 */

package PracticeTest1;

public class Fourth 
{
	public String mixString(String a, String b)
	{
		int x=a.length();
		int y=b.length();
		int z=x+y;
		StringBuilder str=new StringBuilder(z);
		int min;
		if(x<y)
			min=x;
		else
			min=y;
		for(int i=0;i<min;i++)
		{
			str.append(a.charAt(i));
			str.append(b.charAt(i));
		}
		if(x>y)
		{
			str.append(a,y,x);
		}
		else if(x<y)
		{
			str.append(b,x,y);
		}
		return str.toString();
	}
	
	public static void main(String[] args) 
	{
		Fourth f=new Fourth();
		System.out.println(f.mixString("abc","xyz"));
	}

}
