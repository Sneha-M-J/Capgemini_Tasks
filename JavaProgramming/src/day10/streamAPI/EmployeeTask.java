package day10.streamAPI;
//refer EmployeeImplementation class
public class EmployeeTask 
{
	private int empid;
	private String name;
	private double salary;
	private String mgrname;
	private int deptno;
	public EmployeeTask(int empid, String name, double salary, String mgrname, int deptno) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.mgrname = mgrname;
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "EmployeeTask [empid=" + empid + ", name=" + name + ", salary=" + salary + ", mgrname=" + mgrname
				+ ", deptno=" + deptno + "]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getMgrname() {
		return mgrname;
	}
	public void setMgrname(String mgrname) {
		this.mgrname = mgrname;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
