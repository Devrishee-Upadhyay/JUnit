package com.JavaBrains;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
class PrimeNumberTest {

	PrimeNumber numberX;
	private int num;
	private boolean expected;
	
	@Before
	public void init()
	{
		numberX=new PrimeNumber();
	}
	public PrimeNumberTest(int num, boolean expected)    
	{
		this.num=num;
		this.expected=expected;		
	}
	
	@Parameterized.Parameters
	public static Collection primes() 
	{
		return Arrays.asList( new Object[][] {
			{5,true},
			{10,false},
			{11,true}
		});		
	}
	
	@Test
	void test() 
	{

		boolean actual=numberX.validate(num);
		assertEquals(expected,actual);
	}

}
