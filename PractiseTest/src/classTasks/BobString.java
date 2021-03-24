package classTasks;

/*
5. Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
public boolean bobThere(String str) {}

 */
public class BobString 
{
	public boolean bobThere(String str)
	{
		boolean b=false;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='b')
			{
				char ch2=str.charAt(i+2);
				if(ch2=='b')
				{
					b=true;
					break;
				}
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		BobString obj=new BobString();
		System.out.println(obj.bobThere("abcbob"));
		System.out.println(obj.bobThere("b9b"));
		System.out.println(obj.bobThere("bac"));
	}

}
