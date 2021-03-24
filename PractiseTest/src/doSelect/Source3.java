/* 3. Employee Verification
Your task here is to implement a Java code based on the following specifications. Note that your code should 
match the specifications in a precise manner. Consider default visibility of classes, data fields and methods 
unless mentioned otherwise.

Specifications:

class definitions:
  class Employee:
    data fields:
      name: String
      salary: int
    Implement a Constructor using the class variables.
    Implement getter setter methods with public visibility.
  class EmployeeInfo:
    enum definition:
      named constants: BYNAME
                       BYSALARY
    method definitions:
      sort(List<Employee> emps, final SortMethod method): Method to return sorted list by name and by salary using SortMethod
           Return type: List<Employee>
           Visibility: public
      isCharacterPresentInAllNames(Collection<Employee> entities, String character): method to check if Employee list contains 
      a name starting with a specific character
           Return type: boolean
           Visibility: public
Task:

Create an Employee class which has the following members:

 String name;
 int salary;
Define parameterized constructor.
Define getter method for all instance variables with public visibility.(getName(),...)
Define setter methods for all instance variables with public visibility.(setName(),....)
Create an EmployeeInfo class which performs following operations (as per the given requirements) using StreamAPI:

enum SortMethod : representing a group of named constants BYNAME and BYSALARY
sort(List<Employee> emps, final SortMethod method): Method to return sorted list by name and by salary using SortMethod
isCharacterPresentInAllNames(Collection<Employee> entities, String character): Method to check if Employee list contains a name 
starting with a specific character
Implement using Lambda expressions.

Following has been done for you:
Main() method containing list of Employees
String toString() method, it's part of code stub, don't edit it else your test-cases might fail
Sample Input

List<Employee> emps = new ArrayList<>();
emps.add(new Employee("Mickey", 100000));
emps.add(new Employee("Timmy", 50000));
emps.add(new Employee("Annny", 40000));
Sample Output

[<name: Annny salary: 40000>, <name: Mickey salary: 100000>, <name: Timmy salary: 50000>]
[<name: Annny salary: 40000>, <name: Timmy salary: 50000>, <name: Mickey salary: 100000>]
false
NOTE

Do not use any for loops or other control structures.
Use the stream API methods for your implementations, else the test-cases might fail.
You CAN implement the main() method to check the implementation of your methods in the solution.
Upon implementation of main() method, you can use the RUN CODE button to pass input data in the method calls 
and arrive at some output.
 */

package doSelect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee 
{
    private String name;
    private int salary;
    public Employee(String name,int salary)
    {
        super();
        this.name=name;
        this.salary=salary;
    }

    public String getName()
    {
        return this.name;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();
    }
}

class EmployeeInfo
{
    enum SortMethod 
    {
        BYNAME, BYSALARY
    };
    public List<Employee> sort(List<Employee> emps, final SortMethod method)
    {
        switch(method)
        {
            case BYNAME:
            return emps.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

            case BYSALARY:
            return emps.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.toList());
        }
        return null;
    }

    public boolean isCharacterPresentInAllNames(Collection<Employee> entities, String character)
    {
        long c=0;
        c=entities.stream().filter(e->e.getName().endsWith(character)).count();
        if(c==entities.size())
           return true;
        else
           return false;
    }
}

public class Source3 
{
	public static void main(String[] args) 
	{
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Mickey", 100000));
		emps.add(new Employee("Timmy", 50000));
		emps.add(new Employee("Annny", 40000));
		
		EmployeeInfo obj=new EmployeeInfo();
		//obj.sort(emps, SortMethod BYNAME)
		System.out.println(obj.isCharacterPresentInAllNames(emps,"y"));
		System.out.println(obj.isCharacterPresentInAllNames(emps,"a"));
	}

}
