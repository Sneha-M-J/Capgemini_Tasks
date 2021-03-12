package March12;

class Shape
{
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public void erase()
	{
		System.out.println("Erasing Shape");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void erase()
	{
		System.out.println("Erasing Circle");
	}
}

class Triangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing triangle");
	}
	public void erase()
	{
		System.out.println("Erasing triangle");
	}
}

class Square extends Shape
{
	public void draw()
	{
		System.out.println("Drawing square");
	}
	public void erase()
	{
		System.out.println("Erasing square");
	}
}

public class Second 
{
	public static void main(String[] args) 
	{
		Circle c=new Circle();
		c.draw();
		c.erase();
		
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		
		Square s=new Square();
		s.draw();
		s.erase();
		
	}

}
