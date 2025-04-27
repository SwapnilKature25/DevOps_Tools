package com.nit.test;

// we make it static beacuse we are  using assertEquals() without class name 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.nit.service.BankOperationsService;

@DisplayName("BankOperationsTestCase class")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)    // going with order
//@TestMethodOrder(MethodOrderer.MethodName.class)    // going with method name
//@TestMethodOrder(MethodOrderer.DisplayName.class)    // going with display name
//@TestMethodOrder(MethodOrderer.Random.class)    // going with random order
@Order(1)
public class BankOperationsServiceTest {
	private static BankOperationsService service;
	
	@BeforeAll
	public static void setUpOnce()
	{
		System.out.println("BankOperationsServiceTest.setUpOnce()");
		service=new BankOperationsService();
	}
	
	
	@BeforeEach
	public void setup()
	{
		System.out.println("BankOperationsServiceTest.setup()");
	}
	
	
	@Test
	@DisplayName("simpleInterest Method Testing with Big values")
	@Tag("uat")
	@Tag("test")
	@Order(1)
	public void testCalculateSimpleInterestAmountWithBigValues()
	{
		System.out.println("BankOperationsServiceTest.testCalculateSimpleInterestAmountWithBigValues()");
		double pamt=10000000.0;
		double rate=2.0;
		double time=12.0;
		double expected=2400000.0;
		double actual=service.calculateSimpleInterest(pamt, time, rate);
		assertEquals(expected,actual);
	}
	
	@Test
	@Tag("test")
	@DisplayName("simpleInterest Method Testing with Small values")
	@Order(2)
	public void testCalculateSimpleInterestAmountWithSmallValues()
	{
		System.out.println("BankOperationsServiceTest.testCalculateSimpleInterestAmountWithSmallValues()");
		double pamt=100000.0;
		double rate=2.0;
		double time=12.0;
		double expected=24000.0;
		double actual=service.calculateSimpleInterest(pamt, time, rate);
		assertEquals(expected,actual);
	}

	
	@Test
	@DisplayName("simpleInterest Method Testing with Wrong values")
	@Tag("test")
	@Tag("uat")
	@Order(3)
	public void testCalculateSimpleInterestAmountWithInvalidValues()
	{
		System.out.println("BankOperationsServiceTest.testCalculateSimpleInterestAmountWithInvalidValues()");
		assertThrows(IllegalArgumentException.class, () -> {
					service.calculateSimpleInterest(10000.0,0.0,-2.0); 
		});
	} 
	
	
	@Test
	@Tag("test")
	@Tag("uat")
	@Order(-1)
	public void testCalculateSimpleInterestAmountWithTimer()
	{
		System.out.println("BankOperationsServiceTest.testCalculateSimpleInterestAmountWithTimer()");
		assertTimeout(Duration.ofSeconds(11), () -> { service.calculateSimpleInterest(100000.0,12.0,2.0); });
	} 
	
	
	@AfterEach
	public void tearDown()
	{
		System.out.println("BankOperationsServiceTest.tearDown()");
	}
	
	
	@AfterAll
	public static void tearDownOnce()
	{
		System.out.println("BankOperationsServiceTest.tearDownOnce()");
		service=null;
	}
}
