package day6.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("three.txt");
		System.out.println(fis.read());
	}
//loop
}
