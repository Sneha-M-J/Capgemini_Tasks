package March12;

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