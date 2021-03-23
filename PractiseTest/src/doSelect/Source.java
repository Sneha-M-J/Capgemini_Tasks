/* 1. List of Operations
Your task here is to implement a Java code based on the following specifications. Note that your code should match
the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless 
mentioned otherwise.

class definitions:
 class ArrayListOps:
 method definitions: 
  makeArrayListInt(int n): Method to create an arrayList with same number of elements as n and set elements to 0
      return type: ArrayList<Integer> 
      visibilty: public           
﻿
  reverseList(ArrayList<Integer> list): Method to Reverse list
      return type: ArrayList<Integer>
      visibilty: public           

  changeList(ArrayList<Integer> list, int m, int n): Method to change all occurences of m to n in list
      return type: ArrayList<Integer>
      visibilty: public   
      
Task:

Your task is to create a class ArrayListOps and implement the following:

1. makeArrayListInt(int n): Method to create an ArrayList with number of elements as n and set elements to 0.

If number of elements n is 4 , then the method should return a list containing [0,0,0,0]
2. reverseList(ArrayList<Integer> list): Method to Reverse list

3. changeList(ArrayList<Integer> list, int m, int n): Method to change all occurences of m to n in list

Important:
To check your program, you can use the main() method (in Source class) given in the stub. You can make suitable 
function calls and use RUN CODE button to check your main() function output.

Sample Input
ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
n = 4(method makeArrayListInt)
m = 28, n = 20(method changeList)

Sample Output
[0, 0, 0, 0]
[12, 10, 28, 33, 25, 10]
[12, 10, 20, 33, 25, 10]
      
NOTE:
The above Sample Output is only for demonstration purposes and will be obtained if you implement the main() 
method with all method calls accordingly.
Upon implementation of main() method, you can use the RUN CODE button to pass input data in the method calls and 
arrive at the Sample Output.
 */

package doSelect;

import java.util.*;
class ArrayListOps 
{
   public ArrayList<Integer> makeArrayListInt(int n)
   {
	   ArrayList<Integer> a=new ArrayList<Integer>();
	   for(int i=0;i<n;i++)
	   {
		   a.add(0);
	   }
	   return a;
   }
   public ArrayList<Integer> reverseList(ArrayList<Integer> list)
   {
	   Collections.reverse(list);
	   return list;
   }
   public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n)
   {
	   Iterator it=list.iterator();
	   int index=0;
	   while(it.hasNext())
	   {
		   int x=(int) it.next();
		   if(x==m)
		   {   
			   list.set(index, n);
		   }
		   index++;
	   }
	   return list;
   }
}

public class Source
{
	public static void main(String[] args) 
	{
		ArrayListOps obj=new ArrayListOps();
		ArrayList<Integer> one=obj.makeArrayListInt(4);
		System.out.println(one);
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(11);
		alist.add(23);
		alist.add(2);
		alist.add(23);
		
		ArrayList<Integer> two=obj.reverseList(alist);
		System.out.println(two);
		
		ArrayList<Integer> three=obj.changeList(alist,2,45);
		System.out.println(three);
	}
}
