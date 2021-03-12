package day5.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		PrintWriter pw=new PrintWriter("two.txt");
		pw.write(100);
		pw.print(100);
		pw.flush();
		pw.close();
	}

}
