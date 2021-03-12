package day4;
//new feature added in Java 1.8
interface collage
{
	void dept(); //abstract method
	default void lab()  //default method (new addition from Java 1.8
	{
		System.out.println("You have to do lab");
	}
}

class Mech implements collage
{
	public void dept()
	{
		System.out.println("This is Mech Dept");
	}
	public void lab()  //can be overridden
	{
		System.out.println("You have to do lab 1 Exercise");
	}
	//if not overridden, lab() of parent interface is only executed
}


public class InterfaceNewFeature 
{
	public static void main(String[] args) 
	{
		Mech m=new Mech();
		m.dept();
		m.lab();
	}

}
