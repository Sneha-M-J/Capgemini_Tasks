package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.app.MyApp;

class MyAppTest {

	MyApp app = new MyApp();
	@Test
	void test()
	{
		assertEquals(4, app.calculate(2, 2));
	}
}
