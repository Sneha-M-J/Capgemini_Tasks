package March12;

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
