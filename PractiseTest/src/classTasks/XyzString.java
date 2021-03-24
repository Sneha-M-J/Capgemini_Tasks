package classTasks;

/*
4. Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by 
a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
public boolean xyzThere(String str) {}
 
 */
public class XyzString
{
	public boolean xyzThere(String str)
	{
		boolean b=false;
		if(str.contains("xyz"))
		{
			int index=str.indexOf("xyz");
			if(index==0)
				b=true;
			else
			{
				char ch=str.charAt(index-1);
				if(ch!='.')
					b=true;
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		XyzString obj=new XyzString();
		System.out.println(obj.xyzThere("abcxyz"));
		System.out.println(obj.xyzThere("abc.xyz"));
		System.out.println(obj.xyzThere("xyz.abc"));
	}

}
