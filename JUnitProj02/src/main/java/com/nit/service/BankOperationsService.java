package com.nit.service;

public class BankOperationsService {
	
	public Double calculateSimpleInterest(double pamt,double time,double rate)
	{
		System.out.println("BankOperationsService.calculateSimpleInterest()");
		// validation logic
		if(pamt==0 || time==0 || rate==0)
			throw new IllegalArgumentException("Invalid inputs");
		
		// calculate interest amount (b.logic)
		double intrAmt = pamt * rate * time/100.0;
		
//		try {
//			Thread.sleep(5000);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
		return intrAmt;	
	}
}
