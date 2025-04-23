package com.nit.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {

	private static MathOperations math;
	
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("MathOperationsTest.setUpOnce()");
		math=new MathOperations();
	}
	
	
	@Test
	public void testSumWithPositive() {
		System.out.println("MathOperationsTest.testSumWithPositive()");
		double x=100.0;
		double y=201.0; 
		double expected = 300.0;
		double actual = math.sum(x, y);
		assertEquals(expected,actual,1.0);   //1.0 refers to delta and here 1.0 difference is ok for me
		/* 
			void org.junit.jupiter.api.Assertions.assertEquals(double expected, double actual, double delta)
			Assert that expected and actual are equal within the given non-negative delta. 

			Equality imposed by this method is consistent with Double.equals(Object) and Double.compare(double, double).
			Parameters:
			expected actual delta  */
	
	}
	
	@Test
	public void testSumWithNegative() {
		System.out.println("MathOperationsTest.testSumWithNegative()");
		double x=-100.0;
		double y=-200.0; 
		double expected = -300.0;
		double actual = math.sum(x, y);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSumWithMixedValues() {
		System.out.println("MathOperationsTest.testSumWithMixedValues()");
		double x=-100.0;
		double y=200.0; 
		double expected = 100.0;
		double actual = math.sum(x, y);
		assertEquals(expected,actual);
	}

	@Test
	public void testSumWithZeros() {
		System.out.println("MathOperationsTest.testSumWithZeros()");
		double x=0.0;
		double y=0.0; 
		double expected = 0.0;
		double actual = math.sum(x, y);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSumWithBigValues() {
		System.out.println("MathOperationsTest.testSumWithBigValues()");
		double x=100000000000.0;
		double y=200000000000.0; 
		double expected = 300000000000.0;
		double actual = math.sum(x, y);
		assertEquals(expected,actual);
	}
	
	
	// sub
	
	@Test
	public void testSubWithPositive() {
		System.out.println("MathOperationsTest.testSubWithPositive()");
		double x=100.0;
		double y=200.0; 
		double expected = -100.0;
		double actual = math.sub(x, y);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSubWithNegative() {
		System.out.println("MathOperationsTest.testSubWithNegative()");
		double x=-100.0;
		double y=-200.0; 
		double expected = 100.0;
		double actual = math.sub(x, y);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testSubWithMixedValues() {
		System.out.println("MathOperationsTest.testSubWithMixedValues()");
		double x=-100.0;
		double y=200.0; 
		double expected = -300.0;
		double actual = math.sub(x, y);
		assertEquals(expected,actual);
	}

	@Test
	public void testSubWithZeros() {
		System.out.println("MathOperationsTest.testSubWithZeros()");
		double x=0.0;
		double y=0.0; 
		double expected = 0.0;
		double actual = math.sub(x, y);
		assertEquals(expected,actual);
	}
	
	@Test
	@Disabled		// to skip some test cases
	public void testSubWithBigValues() {
		System.out.println("MathOperationsTest.testSubWithBigValues()");
		double x=100000000000.0;
		double y=200000000000.0; 
		double expected = -100000000000.0;
		double actual = math.sub(x, y);
		assertEquals(expected,actual);
	}
	
	
	@AfterAll
	public static void tearDownOnce() {
		System.out.println("MathOperationsTest.tearDownOnce()");
		math=null;		// making ready for gc
	}
	
	
}
