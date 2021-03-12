package March12;

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
