//package Lab4;
//
//class Account
//{
//	private long accNum;
//	private double balance;
//	Person p;
//	public void deposit(double amount)
//	{
//		balance+=amount;
//	}
//	public void withdraw(double amount)
//	{
//		balance-=amount;
//	}
//	public double getBalance()
//	{
//		return balance;
//	}
//	public double getAccNum()
//	{
//		return accNum;
//	}
//	public Person getPerson()
//	{
//		return p;
//	}
//	public void setBalance(double balance)
//	{
//		if(balance<500)
//			System.out.println("Balance must be a minimum of 500");
//		this.balance=balance;
//	}
//	public void setAccNum(long accNum)
//	{
//		this.accNum=accNum;
//	}
//	public void setPerson(Person p)
//	{
//		this.p=p;
//	}
//}
//
//class Person
//{
//	private String name;
//	private float age;
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	public void setAge(float age)
//	{
//		this.age=age;
//	}
//	public String getName()
//	{
//		return name;
//	}
//	public float age()
//	{
//		return age;
//	}
//}
//
//
//class SavingsAccount extends Account
//{
//	double minimumBalance=500;
//	public void withdraw(double amount)
//	{
//		balance-=amount;
//	}
//}
//
//class CurrentAccount extends Account
//{
//	overdraftLimit
//}
//public class Exercise1 
//{
//	public static void main(String[] args) 
//	{
//		Account acc1=new Account();
//		Person p1=new Person();
//		p1.setName("Smith");
//		acc1.setPerson(p1);
//		acc1.setBalance(2000);
//		
//		Account acc2=new Account();
//		Person p2=new Person();
//		p2.setName("Kathy");
//		acc2.setPerson(p2);
//		acc2.setBalance(3000);
//		
//		acc1.deposit(2000);
//		acc2.withdraw(2000);
//		
//		double bal1=acc1.getBalance();
//		double bal2=acc2.getBalance();
//		System.out.println("Smith balance : "+bal1);
//		System.out.println("Kathy balance : "+bal2);
//	}
//
//}
