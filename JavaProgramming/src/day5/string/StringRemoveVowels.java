package day5.string;

//Task 2
public class StringRemoveVowels 
{
	public static void main(String[] args) 
	{
		//remove vowels
		String str="Welcome";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch!='A' && ch!='E'  && ch!='I'  && ch!='O'  && ch!='U'  && ch!='a'  && ch!='e'  && ch!='i'  && ch!='o'  && ch!='u')
			{
				System.out.print(ch);
			}
		}
		System.out.println();
		
		
		//Task 3
		//remove duplicate char
		String str2="apple";
		int n=str2.length();
		for(int i=0;i<n;i++)
		{
			char x=str2.charAt(i);
			for(int j=i+1;j<n;j++)
			{
				char y=str2.charAt(j);
				if(x==y)
					break;
			}
			System.out.print(x);
			
		}
	}

}
