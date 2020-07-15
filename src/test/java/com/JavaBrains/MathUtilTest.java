package com.JavaBrains;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilTest 
{
	MathUtil util;
	
	@BeforeAll
	static void initStart()
	{
		System.out.println("Running before all");
	}
	
	@BeforeEach      //This annotation signifies that this method would run before every test method
	void init()
	{
		util=new MathUtil();
	}
	
	@AfterEach
	void cleanup()
	{
		System.out.println("Cleaning up..");
	}
	
	@Test
	@DisplayName("Testing add method")
	void testAdd() {
		int expected=6;
		int actual=util.add(3, 3);
		assertEquals(expected,actual);
	}

	@Test
	void testDiv()
	{
		int num1=2;
		int num2=5;
		boolean value=num1>num2?true:false;
		assumeTrue(value); // if the value is true then only the test would run else it would be skipped.
		assertThrows(ArithmeticException.class,()->util.divide(1, 0));
	}
	
	@Test
	void testMultiply()
	{
		assertAll(
				()->assertEquals(4,util.multiply(2, 2)),
				()->assertEquals(-2,util.multiply(2, -1)),
				()->assertEquals(0,util.multiply(1, 2))
				);
		
	}
	
}
