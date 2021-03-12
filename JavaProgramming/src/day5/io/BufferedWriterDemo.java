package day5.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));
		//or
		FileWriter fw= new FileWriter("one.txt");
		BufferedWriter bw1=new BufferedWriter(fw);	
		bw1.write("hello");
		bw1.newLine();
		bw1.write("Java");
		bw1.newLine();
		bw1.write("Thanks");
		
		bw1.flush();
		bw1.close();
	}
}
