package day5.io;

import java.io.File;
import java.io.IOException;

public class FileDemo1 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("abc.txt");   //creates or checks file in current project directory
		//if u want to create in a specific directory , use below syntax
		//File f=new File("C:\\Users\\Documents....\\abc.txt");
		System.out.println(f.exists());
		if(f.exists())
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
			System.out.println("I am creating a file");
			f.createNewFile();  //creates an empty file abc
			//created in C:\Users\Sneha.M.J\Documents\workspace-spring-tool-suite-4-4.9.0.RELEASE\JavaProgramming
		}
		
		//check and create a directory
		File f1=new File("movies");
		System.out.println(f1.exists());
		f1.mkdir(); //creates a directory
		System.out.println(f1.exists());
	}

}
