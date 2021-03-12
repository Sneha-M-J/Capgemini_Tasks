package day6.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		FileInputStream fis=new FileInputStream("four.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e=(Employee)ois.readObject();
		System.out.println(e.id+" "+e.name+" "+e.age);
	}

}
