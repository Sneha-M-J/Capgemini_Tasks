package day5.string;

//Task 1
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String str="Hello";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
