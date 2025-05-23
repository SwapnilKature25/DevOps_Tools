package com.nit.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nit.service.Arithmetic;

/**
 * Unit test for simple App.
 */
public class AppTest {
//	each @Test method represents one test case 
	@Test
     public void testSumWithPositives()
     {
    	 int x=10;
    	 int y=20;
    	 int expected = 30;
//    	 find result
    	 Arithmetic ar=new Arithmetic();
    	 int actual = ar.sum(x, y);
    	 
    	 // to test expected result with actual results we have assertX() method
    	 assertEquals(expected, actual);
    	 
    	 
     }
	
	@Test
    public void testSumWithNegatives()
    {
   	 int x=-10;
   	 int y=-20;
   	 int expected = -30;
//   	 find result
   	 Arithmetic ar=new Arithmetic();
   	 int actual = ar.sum(x, y);
   	 assertEquals(expected, actual);
   	 
    }
	
	@Test
    public void testSumWithMixedValues()
    {
   	 int x=-10;
   	 int y=20;
   	 int expected = 10;
//   	 find result
   	 Arithmetic ar=new Arithmetic();
   	 int actual = ar.sum(x, y);
   	 assertEquals(expected, actual);
    }
	
	
	@Test
    public void testSumWithZeros()
    {
   	 int x=0;
   	 int y=0;
   	 int expected =0;
  // find result
   	 Arithmetic ar=new Arithmetic();
   	 int actual = ar.sum(x, y);
   	 assertEquals(expected, actual);
    }
	
	
	
}
