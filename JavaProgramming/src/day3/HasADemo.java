package day3;

class Employee2
{
	int id;
	String name;
	String dept;
	Address ad; //entity reference or object reference
	public Employee2(int id, String name, String dept, Address ad) 
	{
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.ad = ad;
	}
	void dispEmp()
	{
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Department "+dept);
		System.out.println("DoorNo "+ad.doorNo);
		System.out.println("StreetName "+ad.streetName);
		System.out.println("pincode "+ad.pincode);
		System.out.println();
	}
}


class Address
{
	int doorNo;
	String streetName;
	int pincode;
	public Address(int doorNo, String streetName, int pincode) 
	{
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.pincode = pincode;
	}	
}


public class HasADemo 
{
	public static void main(String[] args) 
	{
		Address addr=new Address(105,"Ganganagar",560032);
		Employee2 emp=new Employee2(1,"Srujan","Development",addr);
		emp.dispEmp();
		
		Employee2 emp2=new Employee2(2,"Shreya","Hr", new Address(120,"R T Nagar",560034));
        emp2.dispEmp();	
	}

}
