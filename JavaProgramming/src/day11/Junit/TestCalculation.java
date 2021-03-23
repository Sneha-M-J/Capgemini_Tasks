package day11.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//this is not a class but a Junit
class TestCalculation
{
	// general example	
	@Test    //will check at the runtime
	void mytest1() 
	{
		//assertTrue looks for only true values
		assertTrue(true);     //test case is successfull
		//assertTrue(false);  //test case will fail
		
		//assertFalse looks for only false values
		assertFalse(false);  //test case is successfull
		//assertFalse(true);    //test case will fail
		
		//assertEquals looks for equal values (it checks for values if they are equal)
		assertEquals("hello","hello");   //test case is successfull   
		//assertEquals("hello","helo");   //test case will fail
	}
	
	Calculation c=new Calculation();   //using methods defined in calculation class
	@Test
	void test2()
	{
		assertEquals(4,c.add(2, 2));   //runs successfully
		//assertEquals(4,c.add(2, -2));    //failure
		//assertEquals(4,c.add(2, 0));     //failure
	}

	@Test
	void test3()
	{
		assertTrue(c.nameTest("ankit"));  //looks for only true results  //success
		//assertFalse(c.nameTest("ankit"));   //failure
		
		assertFalse(c.nameTest("kumar"));  //looks for only false results  //success
		//assertFalse(c.nameTest("ankit"));    //failure
	}
	
	@Test
	void test4()
	{
		assertTrue(c.palindrome("madam"));
		assertFalse(c.palindrome("sneha"));
	}
	
	@ParameterizedTest    //we can have a set of strings and pass it as input to the testcase
	@ValueSource(strings= {"madam","radar","naman"})
	void test5(String s1)
	{
		assertTrue(c.palindrome(s1));
	}
	
	@AfterEach    //this code is executed after each test case is executed
	void test6()
	{
		System.out.println("after each");
		c=null;
	}
	
	@BeforeEach   //this code is executed before each test case is executed
	void test7()
	{
		c=new Calculation();
		System.out.println("before each");
	}
}
