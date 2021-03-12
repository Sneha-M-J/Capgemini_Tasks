package day5.string;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		String text="Hello Welcome"+"java"+"python"+"sql";
		System.out.println(text);
		
		//default capacity = 16
		//new capacity = old capacity *2+2
		StringBuffer sb=new StringBuffer();
		System.out.println("Length :"+sb.length());
		System.out.println("capacity : "+sb.capacity());
		
		sb.append("hello welcome");
		System.out.println("Length :"+sb.length());
		System.out.println("capacity : "+sb.capacity());
		
		sb.append("to java");
		System.out.println("Length :"+sb.length());
		System.out.println("capacity : "+sb.capacity());
	}

}
