/*
2. Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
public String repeatEnd(String str, int n)
{ }

 */

package PracticeTest1;

public class Fifth 
{
	public String repeatEnd(String str,int n)
	{
		int len=str.length();
		int i=len-n;
		String sub=str.substring(i);
		String s=new String("");
		for(int j=0;j<n;j++)
		{
			s=s+sub;
		}
		return s;
	}
	public static void main(String[] args) 
	{
		Fifth f=new Fifth();
		System.out.println(f.repeatEnd("Hello",3));
	}

}
