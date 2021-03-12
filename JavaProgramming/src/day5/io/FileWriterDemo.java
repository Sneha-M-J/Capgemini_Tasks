package day5.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("abc.txt",true);
		//FileWriter fw=new FileWriter("abc.txt");
		//true -> contents are appended , otherwise contents are overwritten to the file
		fw.write("hello ");
		fw.write("Welcome\n");
		fw.flush();
		fw.close();
	}
}
