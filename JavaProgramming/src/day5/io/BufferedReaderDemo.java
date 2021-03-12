package day5.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderDemo 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		String r = br.readLine();
		while(r != null)
		{
			System.out.println(r);
			r = br.readLine();
		}	
	}

}
