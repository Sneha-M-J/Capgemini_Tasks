package Lab3;

public class Exercise8 
{
	public boolean posString(String str)
	{
		str=str.toUpperCase();
		System.out.println("String is : "+str);
		for(int i=0;i<str.length()-1;i++)
		{
			char ch1=str.charAt(i);
			int x=(int)ch1;
			char ch2=str.charAt(i+1);
			int y=(int)ch2;
			if(x>y)
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Exercise8 ex=new Exercise8();
		boolean res=ex.posString("Ant");
	//	boolean res=ex.posString("Tan");
		if(res==true)
			System.out.println("Positive String");
		else
			System.out.println("Not a Positive String");
	}

}
