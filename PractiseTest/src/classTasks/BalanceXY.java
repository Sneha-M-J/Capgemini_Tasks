package classTasks;

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char
somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. 
Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
public boolean xyBalance(String str) {}

 */
public class BalanceXY 
{
	public boolean xyBalance(String str)
	{
		int k=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='x')
				k++;
			else if(ch=='y')
				k=0;			
		}
		if(k==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) 
	{
		BalanceXY b=new BalanceXY();
		System.out.println(b.xyBalance("aaxbby"));
		System.out.println(b.xyBalance("aaxbb"));
		System.out.println(b.xyBalance("yaaxbb"));
	}

}
