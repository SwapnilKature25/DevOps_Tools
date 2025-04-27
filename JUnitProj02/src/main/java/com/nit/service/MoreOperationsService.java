package com.nit.service;

import java.util.Date;

import com.nit.model.Student;

public class MoreOperationsService {
	
	// b.method1
	public boolean isPallendrome(String str)
	{
		if(str==null || str.length()==0 || str.equalsIgnoreCase(""))
			throw new IllegalArgumentException("Invalid String");
		
		// reverse string
		String reverseStr=new StringBuilder().reverse().toString();
		if(reverseStr.equalsIgnoreCase(str))
			return true;
		else 
			return false;	
	}
	
	// b.method2
	public Date showDateByMonth(int month)
	{
		if(month<1 || month>12)
			return new Date();
		else 
			return null;
	}
	
	// b.method
	public Runtime getInstance()
	{
		return Runtime.getRuntime();
	}
	
	// b.method3
	public Student showStudentById(int id)
	{
		if(id<=0)
			return new Student();
		else 
			return new Student(id,"raja","hyd",90f);
	}
	
	
}

