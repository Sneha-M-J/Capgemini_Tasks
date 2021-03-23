package Lab3;

public class Exercise2 
{
	public StringBuffer getImage(StringBuffer str)
	{
		StringBuffer s=new StringBuffer("");
		s.append(str);
		str.reverse();
		s.append('|');
		s.append(str);
		return s;
	}
	
	public static void main(String[] args) 
	{
		StringBuffer str=new StringBuffer("EARTH");
		Exercise2 e=new Exercise2();
		System.out.println("Mirror image of string is");
		System.out.println(e.getImage(str));
	}

}
