package day6.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fos =new FileOutputStream("three.txt");
		String msg="hello";
		byte arr[]=msg.getBytes();
		
		fos.write(67);
		fos.write('a');
		fos.write(arr,1,2); //starts from 1 and takes 2 char
		
		fos.flush();
		fos.close();
		
	}

}
