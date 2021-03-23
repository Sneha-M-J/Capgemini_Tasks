/* 4. Email Operation
Your task here is to implement a Java code based on the following specifications. Note that your code should match
the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless 
mentioned otherwise.

Specifications:

class definitions:
   class Header:
		Variables:
			String from
			String to
		Implement a parameterized constructor to initialize all the instance variables.

   class Email:
		Variables:
			Header header
			String body
			String greetings
		Implement a parameterized constructor to initialize all the instance variables.
  class EmailOperations:
		Methods:
			emailVerify(Email e): Use regular expression to verify if the two email-ids in the Header class is 
			valid or not.[Return type explained in Task part].
				Return type:int
				Visibility: public

			bodyEncryption(Email e): Use Ceasar cipher(Shift-3) to encrypt the body of the email.[To know more 
			refer the Task part] 
				Return type:String
				Visibility: public

			greetingMessage(Email e): In this method you have to return a greeting messgae. The greet part should 
			be taken from greetings variable and signature(name) should be taken from Header's 'from' email 
			address.[To know more refer the Task part] 
				Return type:String
				Visibility: public
				
Class Variables:

   class Header: It contains two email id 'from' and 'to'. 'from' signifies the sender's email address and 'to' 
   signifies receiver's email address.
   class Email: This class contains three parts: first Header header which has two email address from and to,the
    second body which contains the message to send and third greetings which contains greetings such as "Regards", "Thank you", etc.
To access a variable in Header class through Email object we use:

<Email(obj)>.<Email(variable)>.<Header(variable)>
Example to access "from" address from the Email object e we use : e.header.from;

Tasks:
Implement the two classes Email and Header class according to the specifications.
Implement the three methods in the EmailOperations class:
emailVerify (Email e)
bodyEncryption (Email e)
greetingMessage (Email e)

Method Description:
1. emailVerify(Email e):

In this method you have to use regex to check if the email-address to and from in Header class is valid or not. 
Validation is based on:
Email address should start with alphabets(capital/small) or _(underscore).
Email address should have only one @ followed by alphabets.
Email address should end with .(dot) followed by alphabets.
e.g: amit@doselect.com, _ami@doselect.in are valid addresses, but 1ami@dos.com, amit@doselect are invalid 
addresses.
Return 2 if the both email addresses are valid return 1 if one is valid, and 0 if both are invalid.


2. bodyEncryption(Email e):

In this method, you have to use Caesar cipher(shift of 3) to encrypt the body part of the Email return the 
encrypted string.
Caesar shift, is one of the simplest and most widely known encryption techniques. It is a type of substitution
cipher in which each letter in the plaintext is replaced by a letter some fixed number of positions down the 
alphabet. Here the number of shift is 3.
e.g: str = "Hi There Hows you", after encryption becomes "Kl Wkhuh Krzv brx". H get converted to K that is a 
shift of 3 alphabets ahead.
Letters which are capital should be capital and small should be small in Encrypted message. Take care of the 
spaces.


3. greetingMessage(Email e):

In this method, you have to return a concatenated string which contains the greetings variable from Email class 
and Name of the person who is sending the mail(from variable in the Header class).
The name part should not contain anything which is after @ in the email id.
e.g: if greetings = "Regards" and from = "Amit@doselect.com" then you have to return the message "Regards Amit"

Important:
To check your program you have to use the main() function(in Source class) given in the stub. You can make 
suitable function calls and use RUN CODE button to check your main() function output.
 */

package doSelect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email
{
	Header header;
	String body;
	String greetings;
	Email(Header header,String body, String greetings)
	{
		this.header=header;
		this.body=body;
		this.greetings=greetings;
	}
}

class Header
{
	String from;
	String to;
	Header(String from, String to)
	{
		this.from=from;
		this.to=to;
	}
}


class EmailOperations
{
	public int emailVerify(Email e)
	{
		String from=e.header.from;
		String to=e.header.to;
		Pattern p1=Pattern.compile("^[_a-zA-Z]+@[a-zA-Z]+.[a-zA-Z]+$");
		Matcher m1=p1.matcher(from);
		Matcher m2=p1.matcher(to);
		if(m1.matches() && m2.matches())
			return 2;
		else if(m1.matches() || m2.matches())
			return 1;
		else 
			return 0;
	}
	
	public String bodyEncryption(Email e)
	{
		String b=e.body;
		StringBuffer res=new StringBuffer("");
		for(int i=0;i<b.length();i++)
		{
			char ch=b.charAt(i);
			if(ch==' ')
				res.append(ch);
			else if(ch=='X')
				res.append('A');
			else if(ch=='Y')
				res.append('B');
			else if(ch=='Z')
				res.append('C');
			else if(ch=='x')
				res.append('a');
			else if(ch=='y')
				res.append('b');
			else if(ch=='z')
				res.append('c');
			else
			{
				ch+=3;   
			    res.append(ch);
			}			
		}
		//String str=new String(res);
		return res.toString();

	}
	
	public String greetingMessage(Email e)
	{
		String str1=e.greetings;
		String str2=e.header.from;
		int index=str2.indexOf('@');
		String str3=str2.substring(0,index);
		String res=str1.concat(" ").concat(str3);
		return res;
		
	}
}


public class Source4 
{
	public static void main(String[] args) 
	{
		Header h=new Header("amit@doselect.com","amit@doselect");
		Email e=new Email(h,"Hi There Hows you","thank you");
		EmailOperations eo=new EmailOperations();
		int res=eo.emailVerify(e);
		System.out.println(res);

		String str2=eo.bodyEncryption(e);
		System.out.println(str2);
		
		String str3=eo.greetingMessage(e);
		System.out.println(str3);
	}

}
