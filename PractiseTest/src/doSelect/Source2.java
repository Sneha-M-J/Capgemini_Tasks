/* 2. Handling Stuff
In Java, we can use more than one catch block with the try block. Generally, multiple catch block is used to 
handle different types of exceptions, which means each catch block is used to handle different types of 
exception.
If you use multiple catch blocks for the same type of exception, then it will give you a compile-time error 
because Java does not allow you to use multiple catch block for the same type of exception. A catch block is 
always preceded by the try block.
Write a program to demonstrate Multiple Exceptions.

class Activity:
    data fields:
      String string1
      String string2
      String operator
    Constructor to initialize the class variables.

class Source:
		method definitions:
			handleException(Activity a): implement try-catch blocks and throw different exceptions as described under Tasks
				return type: String
				visibility: public

			doOperation(Activity a): implement switch statement to calculate Result based on value of Operator
				return type: String
				visibility: public
				
				
You have to implement the following methods under Source class:

handleException (Activity a) - In this function you have to check for exceptions.
doOperation (Activity a) - this function should implement the string operation between string1 and string2 for the operator operator.
If operator = '+', concat the strings string1 and string2.
e.g. for string1 = "hello" and string2 = "world", then result = "helloworld"
If operator = '-', replace the contents of string2 in string1 with empty string.
e.g. If string1 = "helloworld" and string2 = "world", then result = "hello"
Tasks:

In the function handleException (Activity a):

Check that the value of either string1 or string2 variable is null, then throw appropriate exception for NullPointerException and return "Null values found".
Check if the value of operator variable is not equal to these string operators ((+ or -) using logical AND operator. If the condition is true then throw and return the default exception with the Operator as the return message.
If no exception is found return "No Exception Found".
In the function doOperation (Activity a):

perform the string operations, using switch statement and return the correct value.

IMPORTANT:
If you want to test your program, you can implement a main() function given in the stub and you can use RUN CODE to test your main() provided you have made valid function calls with valid data required.
 */






package doSelect;

//class DefaultException extends Exception
//{
//	public DefaultException(String msg)
//	{
//		super(msg);
//	}
//}

class Activity
{
String string1;
String string2;
String operator;
Activity(String string1,String string2,String operator)
{
 this.string1=string1;
 this.string2=string2;
 this.operator=operator;
}

}
public class Source2
{
	public String handleException(Activity a) 
	  {
		try
		{
		if(a.string1==null ||a.string2==null)
	      throw new NullPointerException("Null values found");
	    }  
		catch(NullPointerException e)
		{
			return "Null values found";
		}
		
		try
		{
	    if(a.operator!="+" && a.operator!="-")
	      throw new Exception(a.operator); 
		}
		catch(Exception e)
		{
			return a.operator;
		}
	    
	      return "No Exception Found";
	  }
	  
	  public String doOperation(Activity a)
	  {
		  String result="";
		    switch(a.operator)
		    {
		      case "+":result=a.string1.concat(a.string2);
		               break;
		      case "-": result=a.string1.replace(a.string2, "");
		               break;
		    }
		    return result;
	  }


	public static void main(String[] args) throws NullPointerException, Exception 
	{
		Activity a=new Activity(null,"world","-");
		Source2 s=new Source2();
		String res=s.handleException(a);
		System.out.println(res);
		String res2=s.doOperation(a);
		System.out.println(res2);
	}

}
