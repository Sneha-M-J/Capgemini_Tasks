/*
3. Given a string and an int n, return a string made of the first n characters of the string, followed by the 
first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, 
inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
public String repeatFront(String str, int n) 
{ }

 */
package PracticeTest1;

public class sixth 
{
	public String repeatFront(String str,int n)
	{
		int len=str.length();
		String fin=new String("");
		for(int i=n;i>0;i--)
		{
			String s=str.substring(0, i);
			fin=fin+s;
		}
		return fin;
	}
	public static void main(String[] args) 
	{
		sixth obj=new sixth();
		System.out.println(obj.repeatFront("Chocolate",4));
	}

}
