package day4;

class Car11
{
	private int yearModel;
	private String make;
	private int speed=0;
	
	public Car11(int yearModel, String make)
	{
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void accelerate()
	{
		speed+=5;
	}
	void brake()
	{
		speed-=5;
		if(speed<0)
			speed=0; //speed should not become negative
	}
}


public class Task1 
{
	public static void main(String[] args) 
	{
		Car11 car=new Car11(1965, "Bat Mobile");
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		car.accelerate();
		System.out.println(car.getSpeed());
		
		System.out.println("==========");
		
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
		car.brake();
		System.out.println(car.getSpeed());
	}
}
