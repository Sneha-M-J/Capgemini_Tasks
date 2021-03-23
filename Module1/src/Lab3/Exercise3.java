package Lab3;

public class Exercise3 
{
	public StringBuffer alterString(StringBuffer str)
	{
		StringBuffer s=new StringBuffer("");
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
					||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				s.append(ch);
			}
			else
			{
				ch++;
				s.append(ch);
			}
		}
		return s;
	}
	
	public static void main(String[] args) 
	{
		StringBuffer str=new StringBuffer("JAVA");
		Exercise3 ex=new Exercise3();
		System.out.println(ex.alterString(str));
	}

}
