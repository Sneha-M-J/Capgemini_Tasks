package day3;

class Employee
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

public class EncapsulationDemo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setId(23);
		System.out.println(e1.getId());
		e1.setName("vwx");
		System.out.println(e1.getName());
		
	}

}
